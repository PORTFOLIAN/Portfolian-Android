package com.example.portfolian

import android.content.Context
import android.content.SharedPreferences
import com.example.portfolian.data.DetailProjectResponse

class MySharedPreferences(context: Context) {
    private val prefsFilename = "prefs"
    private val prefs: SharedPreferences = context.getSharedPreferences(prefsFilename, 0)

    var accessToken: String?
        get() = prefs.getString("accessToken", "")
        set(value) = prefs.edit().putString("accessToken", value).apply()

    var userId: String?
        get() = prefs.getString("userId", "")
        set(value) = prefs.edit().putString("userId", value).apply()
}