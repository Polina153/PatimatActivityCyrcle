package com.example.patimatactivitycyrcle

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val instanceState: String = if (savedInstanceState == null) {
            "Первый запуск!"
        } else {
            "Повторный запуск!"
        }
        //Toast.makeText(applicationContext, "$instanceState - onCreate()", Toast.LENGTH_SHORT)
        //    .show();
        //Toast.makeText(applicationContext, "$instanceState - onCreate()", Toast.LENGTH_SHORT)
        //    .show();
        makeToast("$instanceState - onCreate()")
    }

    override fun onStart() {
        super.onStart()
        //Toast.makeText(applicationContext, "onStart()", Toast.LENGTH_SHORT).show();
        makeToast("onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        /*Toast.makeText(
            applicationContext,
            "Повторный запуск!! - onRestoreInstanceState()",
            Toast.LENGTH_SHORT
        ).show();*/
        makeToast("Повторный запуск!! - onRestoreInstanceState()")
    }

    override fun onResume() {
        super.onResume()
        //Toast.makeText(applicationContext, "onResume()", Toast.LENGTH_SHORT).show();
        makeToast("onResume()")
    }

    override fun onPause() {
        super.onPause()
        //Toast.makeText(applicationContext, "onPause()", Toast.LENGTH_SHORT).show();
        makeToast("onPause()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //Toast.makeText(applicationContext, "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        makeToast("onSaveInstanceState()")
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(applicationContext, "onStop()", Toast.LENGTH_SHORT).show();
        makeToast("onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        //Toast.makeText(applicationContext, "onRestart()", Toast.LENGTH_SHORT).show();
        makeToast("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Toast.makeText(applicationContext, "onDestroy()", Toast.LENGTH_SHORT).show();
        makeToast("onDestroy()")
    }

     private fun makeToast(message: String) {
         Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
         Log.d(ContentValues.TAG, message)
     }

}