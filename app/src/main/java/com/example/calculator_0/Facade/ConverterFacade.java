package com.example.calculator_0.Facade;

import android.content.Context;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ConverterFacade {
    public static void convert(EditText et, TextView tV, Spinner sp1, Spinner sp2, Context context,float[] arr){

        int first=sp1.getSelectedItemPosition();
        int second=sp2.getSelectedItemPosition();
        float input=Float.parseFloat(et.getText().toString());
        if(second==first || input==0){
            Toast toast= Toast.makeText(context,"Введенные данные некорректны!",Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            float output=input/arr[second]*arr[first];
            tV.setText(String.valueOf(output));
        }
    }
}
