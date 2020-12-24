package com.example.lesson_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nameList =ArrayList<String>()
        nameList.add("Серега")
        nameList.add("Леха")
        nameList.add("Егор")
        nameList.add("Семен")
        nameList.add("Денис")
        nameList.add("Степан")

         val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,nameList)
        listView.adapter=adapter
        
        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"Вы выбрали имя: ${nameList.get(position)}",Toast.LENGTH_LONG).show()
        }





    }
}