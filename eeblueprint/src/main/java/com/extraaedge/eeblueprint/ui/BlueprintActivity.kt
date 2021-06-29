package com.extraaedge.eeblueprint.ui

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import com.extraaedge.eeblueprint.R
import com.google.android.material.snackbar.Snackbar
import de.mateware.snacky.Snacky

/**
 *
 * This is Abstract BlueprintActivity, it contains boilerplate code necessary for creating a
 * new activity but in a more concise way yes by using Kotlin.
 * A new activity should be created by extending BlueprintActivity which will help in
 * setting the layout. This class also has kotlin common functions, extension functions..which
 * can come handy if .. It avoids
 * writing of the boilerplate code and use direct functions given. Details about every function can be
 * found at corresponding function.
 */
abstract class BlueprintActivity : AppCompatActivity() {

    private lateinit var mToolbar: Toolbar
    private var progressDialog: BlueprintLoadingDialog? = null

    /**
     * An abstract function for actual functionality
     *
     */
    abstract fun create()

    /**
     * Abstract function to get the view to be inflated in the current activity.
     * Just pass in the view.
     *
     * @return Int
     */
    abstract fun layout(): Int

    /**
     * Abstract function to get the Activity instance, needs to be implemented by child class
     *
     * @return instance of the current Activity
     */
    abstract fun getActivity(): Activity

    abstract fun toolbarPresent(): Boolean

    /**
     * All we need is to pass the layout and if or else you need to a toolbar
     * create function will do whatever you wish to do in terms of functionality.
     *
     * @param savedInstanceState Bundle?
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout())
        configureToolbar()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        create()
    }

    private fun configureToolbar() {
        if (toolbarPresent()) {
            mToolbar = findViewById(R.id.default_toolbar)
            setSupportActionBar(mToolbar)
        }
    }

    /**
     * A function for simply setting up the title
     *
     * @param title String
     */
    protected fun setTitle(title: String) {
        supportActionBar?.title = title
    }

    /**
     *  A function that gets you a back arrow on the left of the Action Bar
     */

    protected fun enableHome() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    /**
     *  A function that secures our application from taking the screenshot.
     */
    protected fun secure() {
        getActivity().window.setFlags(
            android.view.WindowManager.LayoutParams.FLAG_SECURE,
            android.view.WindowManager.LayoutParams.FLAG_SECURE
        )
    }


    /**
     * This function is overridden from the AppCompact Activity to check for
     * ids here when a user clicks the home i.e android.R.id.home the activity performs a
     * back press and returns true
     *
     * @param item MenuItem?
     * @return Boolean
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            getActivity().onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun showProgress(message: String? = null) {
        progressDialog = BlueprintLoadingDialog(this)
        (progressDialog as BlueprintLoadingDialog).show()
        (progressDialog as BlueprintLoadingDialog).setMessage(message)
        (progressDialog as BlueprintLoadingDialog).setCancelable(false)
    }

    fun hideProgress() {
        progressDialog?.let {progressBar ->
            if (progressBar.isShowing && !isFinishing){
                (progressDialog as BlueprintLoadingDialog).dismiss()
            }
        }
    }

    fun snackBarError(message: String, onDismiss: (() -> Unit)? = null) {
        val snackBar = Snacky.builder()
            .setText(message)
            .setActivity(getActivity())
            .setDuration(Snacky.LENGTH_LONG)
            .error()

        if (onDismiss != null) {
            snackBar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    onDismiss()
                }
            })
        }

        snackBar.show()
    }

    fun snackBarSuccess(message: String, onDismiss: (() -> Unit)? = null) {
        val snackBar = Snacky.builder()
            .setActivity(getActivity())
            .setText(message)
            .setDuration(Snacky.LENGTH_SHORT)
            .success()

        if (onDismiss != null) {
            snackBar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    onDismiss()
                }
            })
        }

        snackBar.show()
    }


    fun snackBarInfo(message: String, onDismiss: (() -> Unit)? = null) {
        val snackBar = Snacky.builder()
            .setActivity(getActivity())
            .setText(message)
            .setDuration(Snacky.LENGTH_LONG)
            .warning()


        if (onDismiss != null) {
            snackBar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    onDismiss()
                }
            })
        }

        snackBar.show()

    }

}