package com.example.calculator_0.Facade;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator_0.Activity.CalcActivity;
import com.example.calculator_0.Activity.ConverterActivity;
import com.example.calculator_0.Activity.MainActivity;
import com.example.calculator_0.R;

public class MenuFacade {
    public static  boolean change_menu(MenuItem item, Context context){
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();
        // Операции для выбранного пункта меню
        switch (id) {
            case R.id.calc:
                context.startActivity(new Intent(context,MainActivity.class));
                return true;
            case R.id.conv:
                context.startActivity(new Intent(context, ConverterActivity.class));
                return true;
            case R.id.calc2:
                context.startActivity(new Intent(context, CalcActivity.class));
                return true;
            default:
                return false;
        }
    }

}
