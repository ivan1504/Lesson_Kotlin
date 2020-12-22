package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var text: String = " в <магазине> было 123 яблока а может и <больше кто знает>"
    private var tvText: TextView? = null
    private var tvText2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tv)
        tvText2 = findViewById(R.id.tv2)
        var subText:String=text.substringAfter('<')
        var subText2:String=subText.substringBefore('>')
        tvText?.setText(subText2)
        var subText3:String=subText.substringAfter('<')
        var subText4:String=subText3.substringBefore('>')
        tvText2?.setText(subText4)

    }
}