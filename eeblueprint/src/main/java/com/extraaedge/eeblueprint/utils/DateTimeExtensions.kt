package com.extraaedge.eeblueprint.utils

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.text.format.DateUtils
import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

/**
 * An Extension function which returns the system date in the required format
 *
 * @receiver Calendar
 * @param format String
 * @return String
 */
//region: Calendar, Date-Time Extensions
fun Calendar.getFormattedDate(format: String): String = SimpleDateFormat(format, Locale.ENGLISH)
    .format(this.timeInMillis)


/**
 * An Extension function that get the Date Picker
 *
 * @receiver Calendar
 * @param context Context
 * @param onDateSetListener DatePickerDialog.OnDateSetListener
 * @return DatePickerDialog
 */
fun Calendar.getDatePicker(
    context: Context,
    onDateSetListener: DatePickerDialog.OnDateSetListener
): DatePickerDialog {
    return DatePickerDialog(
        context, onDateSetListener,
        get(Calendar.YEAR), get(Calendar.MONTH), get(Calendar.DAY_OF_MONTH)
    )
}

fun Calendar.getTimePicker(
    context: Context,
    onTimeSetListener: TimePickerDialog.OnTimeSetListener,
    is24HourView: Boolean
): TimePickerDialog {
    return TimePickerDialog(
        context, onTimeSetListener,
        get(Calendar.HOUR_OF_DAY), get(Calendar.MINUTE), is24HourView
    )
}


/**
 *  An Extension function that converts timeInMillis(UNIX) and returns time in human readable
 *  format
 *
 * @receiver Long
 * @param format String
 * @return String
 */

fun Long.getFormattedTime(format: String): String {
    return try {
        SimpleDateFormat(format, Locale.US).format(this)
    } catch (e: Exception) {
        ""
    }
}
//endregion


@SuppressLint("SimpleDateFormat")
fun Date.convertTo(format: String): String? {
    var dateStr: String? = null
    val df = SimpleDateFormat(format)
    try {
        dateStr = df.format(this)
    } catch (ex: Exception) {
        Log.d("date", ex.toString())
    }

    return dateStr
}

// Converts current date to Calendar
fun Date.toCalendar(): Calendar {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal
}

fun Date.isFuture(): Boolean {
    return !Date().before(this)
}

fun Date.isPast(): Boolean {
    return Date().before(this)
}

fun Date.isToday(): Boolean {
    return DateUtils.isToday(this.time)
}

fun Date.isYesterday(): Boolean {
    return DateUtils.isToday(this.time + DateUtils.DAY_IN_MILLIS)
}

fun Date.isTomorrow(): Boolean {
    return DateUtils.isToday(this.time - DateUtils.DAY_IN_MILLIS)
}

fun Date.today(): Date {
    return Date()
}

fun Date.yesterday(): Date {
    val cal = this.toCalendar()
    cal.add(Calendar.DAY_OF_YEAR, -1)
    return cal.time
}

fun Date.tomorrow(): Date {
    val cal = this.toCalendar()
    cal.add(Calendar.DAY_OF_YEAR, 1)
    return cal.time
}

fun Date.hour(): Int {
    return this.toCalendar().get(Calendar.HOUR)
}

fun Date.minute(): Int {
    return this.toCalendar().get(Calendar.MINUTE)
}

fun Date.second(): Int {
    return this.toCalendar().get(Calendar.SECOND)
}

fun Date.month(): Int {
    return this.toCalendar().get(Calendar.MONTH) + 1
}

fun Date.monthName(locale: Locale = Locale.getDefault()): String? {
    return this.toCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, locale)
}

fun Date.year(): Int {
    return this.toCalendar().get(Calendar.YEAR)
}

fun Date.day(): Int {
    return this.toCalendar().get(Calendar.DAY_OF_MONTH)
}

fun Date.dayOfWeek(): Int {
    return this.toCalendar().get(Calendar.DAY_OF_WEEK)
}

fun Date.dayOfWeekName(locale: Locale = Locale.getDefault()): String? {
    return this.toCalendar().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale)
}

fun Date.dayOfYear(): Int {
    return this.toCalendar().get(Calendar.DAY_OF_YEAR)
}

fun Calendar.getFormattedDateWithZone(format: String, timeZone: String): String {
    val simpleDateFormat = SimpleDateFormat(format, Locale.ENGLISH)
    simpleDateFormat.timeZone = TimeZone.getTimeZone(timeZone)
    return simpleDateFormat.format(this.timeInMillis)
}

fun String.getFormattedDateInLocal(): String {
    val actualFormat = SimpleDateFormat(DateTimeFormat.ISO, Locale.getDefault())
    actualFormat.timeZone = TimeZone.getTimeZone(DateTimeFormat.TIME_ZONE_UTC)
    val date = actualFormat.parse(this)
    if (date != null)
        return SimpleDateFormat(
            DateTimeFormat.DD_MM_YYYY_HH_MM_SS_A,
            Locale.getDefault()
        ).format(date)
    return ""
}