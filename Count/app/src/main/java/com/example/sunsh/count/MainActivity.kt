package com.example.sunsh.count

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countUp.setOnClickListener {
            // Code here executes on main thread after user presses button
            var n = Integer.parseInt(countTxt.text as String?)
            val inc = n.inc()
            countTxt.text = inc.toString()
        }

        reset.setOnClickListener{
            countTxt.text = 0.toString();
        }
    }
}
