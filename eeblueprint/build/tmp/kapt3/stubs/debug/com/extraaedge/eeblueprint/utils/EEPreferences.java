package com.extraaedge.eeblueprint.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\fJ\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0012J\u0016\u0010\u001b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/extraaedge/eeblueprint/utils/EEPreferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PREFERENCES", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "getBoolean", "", "key", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "saveBoolean", "value", "saveFloat", "", "saveInt", "saveLong", "saveString", "eeblueprint_debug"})
public class EEPreferences {
    private final java.lang.String PREFERENCES = "extraaedge_preferences";
    private android.content.SharedPreferences sharedPreferences;
    
    public EEPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * Method to store `String` value corresponding to a key
     *
     * @param key   - Key
     * @param value - String value to be stored
     */
    public final void saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    /**
     * Method to store `int` value corresponding to a key
     *
     * @param key   - Key
     * @param value - int value to be stored
     */
    public final void saveInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    /**
     * Method to store `long` value corresponding to a key
     *
     * @param key   - Key
     * @param value - long value to be stored
     */
    public final void saveLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    /**
     * Method to store `boolean` value corresponding to a key
     *
     * @param key   - Key
     * @param value - boolean value to be stored
     */
    public final void saveBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    /**
     * Method to store `float` value corresponding to a key
     *
     * @param key   - Key
     * @param value - Float value to be stored
     */
    public final void saveFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    /**
     * Method to clear all the shared preferences stored, this will be helpful in
     * scenarios like logout
     */
    public final void clear() {
    }
    
    /**
     * Method to get `String` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns null if not found
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * Method to get `long` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns 0 if not found
     */
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0L;
    }
    
    /**
     * Method to get `int` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns 0 if not found
     */
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    /**
     * Method to get `float` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns 0 if not found
     */
    public final double getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0;
    }
    
    /**
     * Method to get `boolean` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns false if not found
     */
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defValue) {
        return false;
    }
}