package com.example.dctoaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toast.CustomToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomToast.toastMessage(this,"Toast")
    }
}