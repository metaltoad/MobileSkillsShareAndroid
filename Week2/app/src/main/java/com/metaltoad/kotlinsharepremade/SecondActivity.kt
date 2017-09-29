package com.metaltoad.kotlinsharepremade

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {

    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val dismiss = findViewById<TextView>(R.id.dismissTextView)
        dismiss.setOnClickListener {
            val data = Intent()
            data.putExtra("random", number)
            setResult(Activity.RESULT_OK, data)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()

        number = Random().nextInt(100)
        val numberTextView = findViewById<TextView>(R.id.generatedTextView)
        val string = "Your number is " + number
        numberTextView.setText(string)
    }
}
