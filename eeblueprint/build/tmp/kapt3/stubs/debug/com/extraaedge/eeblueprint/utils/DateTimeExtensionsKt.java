package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0002\u001a\u001a\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0001\u001a\u001a\u0010\u0014\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0001\u001a\"\u0010\u0018\u001a\u00020\u0019*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\n\u0010\u001e\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u001f\u001a\u00020\u001d*\u00020\u0002\u001a\n\u0010 \u001a\u00020\u001d*\u00020\u0002\u001a\n\u0010!\u001a\u00020\u001d*\u00020\u0002\u001a\n\u0010\"\u001a\u00020\u001d*\u00020\u0002\u001a\n\u0010#\u001a\u00020\u001d*\u00020\u0002\u001a\n\u0010$\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010%\u001a\u00020\u0005*\u00020\u0002\u001a\u0016\u0010&\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\n\u0010\'\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010(\u001a\u00020\r*\u00020\u0002\u001a\n\u0010)\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010*\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010+\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010,\u001a\u00020\u0002*\u00020\u0002\u00a8\u0006-"}, d2 = {"convertTo", "", "Ljava/util/Date;", "format", "day", "", "dayOfWeek", "dayOfWeekName", "locale", "Ljava/util/Locale;", "dayOfYear", "getDatePicker", "Landroid/app/DatePickerDialog;", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "onDateSetListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "getFormattedDate", "getFormattedDateInLocal", "getFormattedDateWithZone", "timeZone", "getFormattedTime", "", "getTimePicker", "Landroid/app/TimePickerDialog;", "onTimeSetListener", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "is24HourView", "", "hour", "isFuture", "isPast", "isToday", "isTomorrow", "isYesterday", "minute", "month", "monthName", "second", "toCalendar", "today", "tomorrow", "year", "yesterday", "eeblueprint_debug"})
public final class DateTimeExtensionsKt {
    
    /**
     * An Extension function which returns the system date in the required format
     *
     * @receiver Calendar
     * @param format String
     * @return String
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getFormattedDate(@org.jetbrains.annotations.NotNull
    java.util.Calendar $this$getFormattedDate, @org.jetbrains.annotations.NotNull
    java.lang.String format) {
        return null;
    }
    
    /**
     * An Extension function that get the Date Picker
     *
     * @receiver Calendar
     * @param context Context
     * @param onDateSetListener DatePickerDialog.OnDateSetListener
     * @return DatePickerDialog
     */
    @org.jetbrains.annotations.NotNull
    public static final android.app.DatePickerDialog getDatePicker(@org.jetbrains.annotations.NotNull
    java.util.Calendar $this$getDatePicker, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.app.DatePickerDialog.OnDateSetListener onDateSetListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.app.TimePickerDialog getTimePicker(@org.jetbrains.annotations.NotNull
    java.util.Calendar $this$getTimePicker, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.app.TimePickerDialog.OnTimeSetListener onTimeSetListener, boolean is24HourView) {
        return null;
    }
    
    /**
     * An Extension function that converts timeInMillis(UNIX) and returns time in human readable
     * format
     *
     * @receiver Long
     * @param format String
     * @return String
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getFormattedTime(long $this$getFormattedTime, @org.jetbrains.annotations.NotNull
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String convertTo(@org.jetbrains.annotations.NotNull
    java.util.Date $this$convertTo, @org.jetbrains.annotations.NotNull
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Calendar toCalendar(@org.jetbrains.annotations.NotNull
    java.util.Date $this$toCalendar) {
        return null;
    }
    
    public static final boolean isFuture(@org.jetbrains.annotations.NotNull
    java.util.Date $this$isFuture) {
        return false;
    }
    
    public static final boolean isPast(@org.jetbrains.annotations.NotNull
    java.util.Date $this$isPast) {
        return false;
    }
    
    public static final boolean isToday(@org.jetbrains.annotations.NotNull
    java.util.Date $this$isToday) {
        return false;
    }
    
    public static final boolean isYesterday(@org.jetbrains.annotations.NotNull
    java.util.Date $this$isYesterday) {
        return false;
    }
    
    public static final boolean isTomorrow(@org.jetbrains.annotations.NotNull
    java.util.Date $this$isTomorrow) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Date today(@org.jetbrains.annotations.NotNull
    java.util.Date $this$today) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Date yesterday(@org.jetbrains.annotations.NotNull
    java.util.Date $this$yesterday) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Date tomorrow(@org.jetbrains.annotations.NotNull
    java.util.Date $this$tomorrow) {
        return null;
    }
    
    public static final int hour(@org.jetbrains.annotations.NotNull
    java.util.Date $this$hour) {
        return 0;
    }
    
    public static final int minute(@org.jetbrains.annotations.NotNull
    java.util.Date $this$minute) {
        return 0;
    }
    
    public static final int second(@org.jetbrains.annotations.NotNull
    java.util.Date $this$second) {
        return 0;
    }
    
    public static final int month(@org.jetbrains.annotations.NotNull
    java.util.Date $this$month) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String monthName(@org.jetbrains.annotations.NotNull
    java.util.Date $this$monthName, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) {
        return null;
    }
    
    public static final int year(@org.jetbrains.annotations.NotNull
    java.util.Date $this$year) {
        return 0;
    }
    
    public static final int day(@org.jetbrains.annotations.NotNull
    java.util.Date $this$day) {
        return 0;
    }
    
    public static final int dayOfWeek(@org.jetbrains.annotations.NotNull
    java.util.Date $this$dayOfWeek) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String dayOfWeekName(@org.jetbrains.annotations.NotNull
    java.util.Date $this$dayOfWeekName, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) {
        return null;
    }
    
    public static final int dayOfYear(@org.jetbrains.annotations.NotNull
    java.util.Date $this$dayOfYear) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getFormattedDateWithZone(@org.jetbrains.annotations.NotNull
    java.util.Calendar $this$getFormattedDateWithZone, @org.jetbrains.annotations.NotNull
    java.lang.String format, @org.jetbrains.annotations.NotNull
    java.lang.String timeZone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getFormattedDateInLocal(@org.jetbrains.annotations.NotNull
    java.lang.String $this$getFormattedDateInLocal) {
        return null;
    }
}