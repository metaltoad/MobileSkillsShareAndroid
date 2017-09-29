package com.metaltoad.kotlinsharepremade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldTextView = findViewById<TextView>(R.id.hello_world_text_view)
        helloWorldTextView.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Hello World Alert")
            builder.setMessage("You have reached the hello world alert")
            builder.setPositiveButton("Ok") {dialogInterface, i ->
                Toast.makeText(this, "You have clicked Ok!", Toast.LENGTH_SHORT).show()
            }
            builder.create().show()
        }
    }
}
