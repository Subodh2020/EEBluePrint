package com.extraaedge.eeblueprint.remote

import android.util.Log
import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.extraaedge.eeblueprint.Blueprint
import com.extraaedge.eeblueprint.utils.EEErrorCodes.INVALID_SESSION
import com.extraaedge.eeblueprint.utils.NETWORK_CODE_401
import com.extraaedge.eeblueprint.utils.getEEError
import com.extraaedge.eeblueprint.utils.isAuthTokenValid
import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

abstract class NetworkBoundResource<ResultType, RequestType> {

    private val result = MutableLiveData<Resource<ResultType>>()
    private val supervisorJob = SupervisorJob()

    suspend fun build(): NetworkBoundResource<ResultType, RequestType> {
        withContext(Dispatchers.Main) { result.value =
            Resource.loading(null)
        }
        CoroutineScope(coroutineContext).launch(supervisorJob) {
            val dbResult = loadFromDb()
            if (shouldFetch(dbResult)) {
                try {
                    fetchFromNetwork(dbResult)
                } catch (e: Exception) {
                    Log.e("NetworkBoundResource", "An error happened: $e")
                    if (e.message != null && e.message!!.contains(NETWORK_CODE_401.toString())){
                        refreshToken()
                    }else{
                        setValue(Resource.error(e.getEEError(), loadFromDb()))
                    }
                }
            } else {
                Log.d(NetworkBoundResource::class.java.name, "Return data from local database")
                setValue(Resource.success(dbResult))
            }
        }
        return this
    }

    fun asLiveData() = result as LiveData<Resource<ResultType>>

    // ---

    @Throws(Exception::class)
    private suspend fun fetchFromNetwork(dbResult: ResultType) {
        Log.d(NetworkBoundResource::class.java.name, "Fetch data from network")
        setValue(Resource.loading(dbResult)) // Dispatch latest value quickly (UX purpose)

        if(!isAuthTokenValid(Blueprint.getContext()))
            refreshToken()

        val apiResponse = createCallAsync()
        Log.d(NetworkBoundResource::class.java.name, "Data fetched from network")
        saveCallResults(processResponse(apiResponse))
        setValue(Resource.success(loadFromDb()))
    }

    @MainThread
    private fun setValue(newValue: Resource<ResultType>) {
        Log.d(NetworkBoundResource::class.java.name, "Resource: $newValue")
        if (result.value != newValue) result.postValue(newValue)
    }

    @WorkerThread
    protected abstract fun processResponse(response: RequestType): ResultType

    @WorkerThread
    protected abstract suspend fun saveCallResults(items: ResultType)

    @MainThread
    protected abstract fun shouldFetch(data: ResultType?): Boolean

    @MainThread
    protected abstract suspend fun loadFromDb(): ResultType

    @MainThread
    protected abstract suspend fun createCallAsync(): RequestType

    protected abstract suspend fun refreshToken()
}