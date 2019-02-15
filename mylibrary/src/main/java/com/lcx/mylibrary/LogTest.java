package com.lcx.mylibrary;

import android.util.Log;

public class LogTest {
    public static final String TAG = LogTest.class.getSimpleName();
    public static void log(String s) {
        Log.e(TAG, s);
    }
}
