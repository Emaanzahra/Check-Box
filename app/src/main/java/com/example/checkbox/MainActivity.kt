package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var checkbox1 : CheckBox
    lateinit var checkbox2 : CheckBox
    lateinit var textview :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox1 = findViewById(R.id.checkBox1)
        checkbox2 = findViewById(R.id.checkBox2)
        textview = findViewById(R.id.txtView)

//         isChecked is a boolean value which is use to check the condition of the button
        checkbox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                textview.text = "Apple"
            }
            else{
                textview.text = ""
            }
        }

        checkbox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                textview.text = "Orange"
            }
            else{
                textview.text = ""
            }
        }



    }
}