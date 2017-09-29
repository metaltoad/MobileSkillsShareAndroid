package com.metaltoad.kotlinsharepremade

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldTextView = findViewById<TextView>(R.id.helloWorldTextView)
        helloWorldTextView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK) {
            val responseTextView = findViewById<TextView>(R.id.responseTextView)
            val number = data?.getIntExtra("random", 0)
            val string = "Your number was " + number
            responseTextView.setText(string)
        }
    }
}
