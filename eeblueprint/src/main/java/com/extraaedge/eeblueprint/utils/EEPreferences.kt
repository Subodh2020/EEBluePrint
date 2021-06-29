package com.extraaedge.eeblueprint.utils

import android.content.Context
import android.content.SharedPreferences

open class EEPreferences(context: Context) {

    private val PREFERENCES = "extraaedge_preferences"

    private var sharedPreferences: SharedPreferences

    init {
        sharedPreferences = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)
    }

    /**
     * Method to store `String` value corresponding to a key
     *
     * @param key   - Key
     * @param value - String value to be stored
     */
    fun saveString(key: String, value: String) {
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    /**
     * Method to store `int` value corresponding to a key
     *
     * @param key   - Key
     * @param value - int value to be stored
     */
    fun saveInt(key: String, value: Int) {
        val editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    /**
     * Method to store `long` value corresponding to a key
     *
     * @param key   - Key
     * @param value - long value to be stored
     */
    fun saveLong(key: String, value: Long) {
        val editor = sharedPreferences.edit()
        editor.putLong(key, value)
        editor.apply()
    }

    /**
     * Method to store `boolean` value corresponding to a key
     *
     * @param key   - Key
     * @param value - boolean value to be stored
     */
    fun saveBoolean(key: String, value: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    /**
     * Method to store `float` value corresponding to a key
     *
     * @param key   - Key
     * @param value - Float value to be stored
     */
    fun saveFloat(key: String, value: Float) {
        val editor = sharedPreferences.edit()
        editor.putFloat(key, value)
        editor.apply()
    }

    /**
     * Method to clear all the shared preferences stored, this will be helpful in
     * scenarios like logout
     */
    fun clear() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    /**
     * Method to get `String` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns null if not found
     */
    fun getString(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    /**
     * Method to get `long` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns 0 if not found
     */
    fun getLong(key: String): Long {
        return sharedPreferences.getLong(key, 0L)
    }

    /**
     * Method to get `int` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns 0 if not found
     */
    fun getInt(key: String): Int {
        return sharedPreferences.getInt(key, 0)
    }

    /**
     * Method to get `float` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns 0 if not found
     */
    fun getFloat(key: String): Double {
        return sharedPreferences.getFloat(key, 0.0f).toDouble()
    }

    /**
     * Method to get `boolean` value from preferences for a given Key
     *
     * @param key - Key to fetch the value
     * @return - Actual value, returns false if not found
     */
    fun getBoolean(key: String, defValue: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(key, defValue)
    }
}