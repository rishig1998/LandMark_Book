package com.example.landmark_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var arreytext=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arreytext= arrayListOf("india","Austrilia","Uk","Malesia","Lundun")
        var arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreytext)
        listview.adapter=arrayAdapter

    }
}