package com.example.toast

import android.content.Context
import android.widget.Toast

class CustomToast {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}