package com.example.sudoscan

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (OpenCVLoader.initDebug()) {
            Log.d("OpenCV", "OpenCV successfully loaded!")
            Toast.makeText(this, "OpenCV successfully loaded!", Toast.LENGTH_SHORT).show()
        } else {
            Log.d("OpenCV", "OpenCV failed to load!")
            Toast.makeText(this, "OpenCV not loaded!", Toast.LENGTH_SHORT).show()
        }
    }
}