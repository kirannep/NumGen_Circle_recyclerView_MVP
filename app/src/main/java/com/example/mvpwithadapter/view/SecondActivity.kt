package com.example.mvpwithadapter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpwithadapter.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var num = intent.getIntExtra("num",0)
        tv_activitySecond.text = num.toString()
    }
}
