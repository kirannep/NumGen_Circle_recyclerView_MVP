package com.example.mvpwithadapter.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvpwithadapter.R
import com.example.mvpwithadapter.ViewInterface
import com.example.mvpwithadapter.model.NumberGenerator
import com.example.mvpwithadapter.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cardview.*

class MainActivity : AppCompatActivity(),ViewInterface {

    private lateinit var presenter:Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = Presenter(this)
        presenter.getNumbers()
    }


    override fun displayNum(list:ArrayList<Int>) {
        val adapter:Adapter = Adapter(list,object:OnNumberClickListener{
            override fun onNumberClick(number: Int) {
                var intent: Intent
                    Toast.makeText(this@MainActivity,"clicked",Toast.LENGTH_SHORT).show()
                    intent = Intent(this@MainActivity,SecondActivity::class.java)
                    intent.putExtra("num",number)
                    startActivity(intent)

            }
        })
        recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerview.adapter = adapter


    }
}
