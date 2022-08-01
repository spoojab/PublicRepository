package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val Tag_ONE = "LogOne"
    private val TAG_TWO = "LogTwo"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG_TWO,"Logger two added")
        val TAG_THREE = "three"
        Log.d(TAG_THREE,"Logger two added")
       // Log.d(Tag_ONE, "added one logger")
    }
}
