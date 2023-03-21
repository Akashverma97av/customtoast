package com.example.toasterlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlibrary.MyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyToast.showToast(this,"Welcome to the app.")
    }
}