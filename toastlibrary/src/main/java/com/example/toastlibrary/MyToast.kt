package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

class MyToast {
    companion object{
        fun showToast(context: Context?, message:String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}