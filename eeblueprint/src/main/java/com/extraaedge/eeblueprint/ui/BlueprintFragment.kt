package com.extraaedge.eeblueprint.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import de.mateware.snacky.Snacky

abstract class BlueprintFragment : Fragment() {

    /**
     * An abstract function for actual functionality
     *
     */
    abstract fun create()

    /**
     * Abstract function to get the view to be inflated in the current Fragment.
     * Just pass in the view of type Integer
     *
     * @return Int
     */
    abstract fun layout(): Int


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(layout(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        create()
    }


    fun snackBarError(message: String, onDismiss: (() -> Unit)? = null) {
        val snackBar = Snacky.builder()
            .setText(message)
            .setActivity(requireActivity())
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
            .setActivity(requireActivity())
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
            .setActivity(requireActivity())
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