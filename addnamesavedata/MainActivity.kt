package com.addname.ui.addnamesavedata

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var NameText: EditText
    lateinit var AddName: Button
    lateinit var Showcase: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NameText = findViewById(R.id.NameText)
        AddName = findViewById(R.id.AddName)
        Showcase = findViewById(R.id.Showcase)

        AddName.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        val name = NameText.text
        Showcase.text = "$name"

    }
}