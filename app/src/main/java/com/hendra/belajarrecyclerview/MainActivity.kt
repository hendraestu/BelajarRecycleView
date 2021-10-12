package com.hendra.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUser = arrayOf(
        "Alpa",
        "Bravo",
        "Charlie"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}