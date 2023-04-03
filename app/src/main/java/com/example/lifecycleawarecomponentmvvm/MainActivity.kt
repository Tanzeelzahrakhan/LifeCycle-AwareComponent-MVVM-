package com.example.lifecycleawarecomponentmvvm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var txtCounter: TextView
    lateinit var txtCounter1: TextView
    lateinit var txtCounter2: TextView
    lateinit var mainViewModel: MainViewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        txtCounter=findViewById(R.id.tvZero)
        txtCounter1=findViewById(R.id.tvOne)
        txtCounter2=findViewById(R.id.tvTwo)
        setText()
    }

     fun setText() {
        txtCounter.text=mainViewModel.count.toString()
        txtCounter1.text=mainViewModel.count1.toString()
        txtCounter2.text=mainViewModel.count2.toString()

    }

    fun Increment(view: View) {
        mainViewModel.count++
        setText()
    }

    fun Increment1(view: View) {
        mainViewModel.count1++
        setText()

    }
    fun Increment2(view: View) {
        mainViewModel.count2++
        setText()
    }


}