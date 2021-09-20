package com.example.calculator_0.Facade

import android.content.Context
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class ConverterFacade {
    fun convert(et: EditText, tv: TextView, sp1: Spinner,
                sp2:Spinner,context: Context,arr:FloatArray) {
        val first = sp1.selectedItemPosition
        val second = sp2.selectedItemPosition
        val input:Float = et.text.toString().toFloat()
        if(second == first || input==0F){
            Toast.makeText(context,"Введенные данные некорректны!",Toast.LENGTH_LONG).show()
        }
        else{
            tv.text = (input/arr[second]*arr[first]).toString()
        }
    }
}