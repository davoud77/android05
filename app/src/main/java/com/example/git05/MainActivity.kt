package com.example.git05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    private fun main() {
        val name = "davoud"
        val family = "fathi"

        Toast.makeText(this, "$name and $family", Toast.LENGTH_SHORT).show()
    }
}