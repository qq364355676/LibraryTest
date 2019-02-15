package com.lcx.librarytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lcx.mylibrary.LogTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogTest.log("测试")
    }
}
