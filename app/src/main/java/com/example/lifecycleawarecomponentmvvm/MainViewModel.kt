package com.example.lifecycleawarecomponentmvvm

import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {
    var count: Int =0;
    var count1: Int =0;
    var count2: Int =0;
    fun Increment(){
        count++;
    }
    fun Increment1(){
        count1++;
    }
    fun Increment2(){
        count2++;
    }
}