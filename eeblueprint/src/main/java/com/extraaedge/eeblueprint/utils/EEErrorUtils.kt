package com.extraaedge.eeblueprint.utils


const val NETWORK_CODE_401: Int = 401
const val NETWORK_CODE_404: Int = 404
const val NETWORK_CODE_400: Int = 400
const val NETWORK_CODE_500: Int = 500
const val NETWORK_CODE_502: Int = 502


const val NO_NETWORK_MESSAGE = "Slow Internet connection, please retry"
const val SOMETHING_WENT_WRONG = "Something went wrong! please retry"
const val SERVER_NOT_RESPONDING = "Server is not responding! please retry"
const val INVALID_SESSION_MESSAGE = "Your session is invalid please re-login"
const val RESOURCE_NOT_FOUND = "Expected resource not found, please retry"
const val BAD_REQUEST_MESSAGE = "Unsuccessful request, please try again"


object EEErrorCodes {
    const val INVALID_SESSION: Int = 1001
    const val NO_INTERNET: Int = 1002
    const val SERVER_ERROR: Int = 1003
    const val GENERIC_ERROR: Int = 1000
    const val RESOURCE_NOT_FOUND: Int = 1004
    const val BAD_REQUEST: Int = 1005
}


fun Int.errorMessageFromCode() : String {
    return when (this) {
        EEErrorCodes.INVALID_SESSION -> INVALID_SESSION_MESSAGE
        EEErrorCodes.NO_INTERNET -> NO_NETWORK_MESSAGE
        EEErrorCodes.SERVER_ERROR -> SERVER_NOT_RESPONDING
        EEErrorCodes.RESOURCE_NOT_FOUND -> RESOURCE_NOT_FOUND
        EEErrorCodes.GENERIC_ERROR -> SOMETHING_WENT_WRONG
        EEErrorCodes.BAD_REQUEST -> BAD_REQUEST_MESSAGE
        else -> SOMETHING_WENT_WRONG
    }
}




