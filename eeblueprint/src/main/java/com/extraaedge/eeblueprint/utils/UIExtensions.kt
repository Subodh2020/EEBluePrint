package com.extraaedge.eeblueprint.utils

import android.content.res.Resources
import android.graphics.Paint
import android.text.Editable
import android.text.Spannable
import android.text.TextWatcher
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.textfield.TextInputLayout


/**
 * An Extension function that allows the commit after the state of the Activity is saved.
 *
 * @receiver FragmentManager
 * @param container Int
 * @param fragment Fragment
 */
//region: Fragment Extensions
fun FragmentManager.addFragAllowingStateLoss(container: Int, fragment: Fragment) {
    this.beginTransaction()
        .add(container, fragment)
        .commitAllowingStateLoss()
}

/**
 * An Extension function to add a fragment
 *
 * @receiver FragmentManager
 * @param container Int
 * @param fragment Fragment
 */
fun FragmentManager.addFragment(container: Int, fragment: Fragment) {
    this.beginTransaction()
        .add(container, fragment)
        .commit()
}

/**
 * An Extension function that allows the commit after the state of the Activity is saved.
 *
 * @receiver FragmentManager
 * @param container Int
 * @param fragment Fragment
 * @param addToBackStack Boolean
 */
fun FragmentManager.replaceFragAllowingStateLoss(
    container: Int, fragment: Fragment,
    addToBackStack: Boolean
) {
    if (addToBackStack) {
        this.beginTransaction()
            .replace(container, fragment)
            .addToBackStack(null)
            .commitAllowingStateLoss()
    } else {
        this.beginTransaction()
            .replace(container, fragment)
            .commitAllowingStateLoss()
    }

}

/**
 * An Extension function that replaces the fragment
 *
 * @receiver FragmentManager
 * @param container Int
 * @param fragment Fragment
 * @param addToBackStack Boolean
 */
fun FragmentManager.replaceFragment(
    container: Int, fragment: Fragment,
    addToBackStack: Boolean
) {
    if (addToBackStack) {
        this.beginTransaction()
            .replace(container, fragment)
            .addToBackStack(null)
            .commit()
    } else {
        this.beginTransaction()
            .replace(container, fragment)
            .commit()
    }

}
//endregion


//region: View Visibility extensions
fun View.show(): View {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
    return this
}

fun View.invisible(): View {
    if (visibility != View.INVISIBLE) {
        visibility = View.INVISIBLE
    }
    return this
}

fun View.gone(): View {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
    return this
}

fun ArrayList<View>.gone() {
    this.forEach {
        it.gone()
    }
}

fun ArrayList<View>.show() {
    this.forEach {
        it.show()
    }
}

fun ArrayList<View>.enable() {
    this.forEach {
        it.enable()
    }
}

fun ArrayList<View>.disable() {
    this.forEach {
        it.disable()
    }
}

fun ArrayList<View>.onClick(listener: View.OnClickListener) {
    this.forEach {
        it.setOnClickListener(listener)
    }
}

fun View.enable() {
    isEnabled = true
}

fun View.disable() {
    isEnabled = false
}

//endregion


//region: DisplayMetrics
val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()

//endregion


/**
 * An Extension function to get the text of the selected checked button
 *
 * @receiver RadioGroup
 * @return String
 */

//region: UI
fun RadioGroup.getCheckedButtonText(): String {
    val radioButtonID = this.checkedRadioButtonId
    val radioButtonView = this.findViewById<View>(radioButtonID)
    val idx = this.indexOfChild(radioButtonView)
    if (idx == -1) {
        return ""
    }
    val radioButton = this.getChildAt(idx) as RadioButton
    return radioButton.text.toString()
}
//endregion


//region: TextView

fun TextView.bold() {
    paint.isFakeBoldText = true
    paint.isAntiAlias = true
}

fun TextView.underLine() {
    paint.flags = paint.flags or Paint.UNDERLINE_TEXT_FLAG
    paint.isAntiAlias = true
}

fun TextView.setColorOfSubstring(substring: String, color: Int) {
    try {
        val spannable = android.text.SpannableString(text)
        val start = text.indexOf(substring)
        spannable.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(context, color)), start,
            start + substring.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        text = spannable
    } catch (e: Exception) {
        Log.d(
            "ViewExtensions", "exception in setColorOfSubstring, " +
                    "text=$text, substring=$substring", e
        )
    }
}

fun TextView.setDrawableLeft(drawable: Int) {
    this.setCompoundDrawablesWithIntrinsicBounds(drawable, 0, 0, 0)
}

fun ArrayList<EditText>.clear() {
    this.forEach {
        it.clear()
    }
}

fun EditText.clear() {
    setText("")
}

fun TextInputLayout.disableError() {
    isErrorEnabled = false
}


fun EditText.onTextChanged(onTextChanged: (String) -> Unit) {

    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(currentValue: CharSequence?, p1: Int, p2: Int, p3: Int) {
            onTextChanged(currentValue.toString())
        }

    })
}

fun EditText.onFocusLost(onFocusLost: () -> Unit) {
    setOnFocusChangeListener { _, hasFocus ->
        if (!hasFocus) {
            onFocusLost()
        }
    }
}


//endregion
