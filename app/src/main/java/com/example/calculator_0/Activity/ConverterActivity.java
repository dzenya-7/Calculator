package com.example.calculator_0.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.calculator_0.Facade.ConverterFacade;
import com.example.calculator_0.Facade.MenuFacade;
import com.example.calculator_0.R;

public class ConverterActivity extends AppCompatActivity {

    private MenuItem item;
    float[] arr = {100000.0F, 100.0F, 91.44F, 30.48F, 2.54F, 1.0F, 0.1F};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }

    public void OnConvertClick(View view) {
        EditText editText=findViewById(R.id.editText2);
        TextView textView=findViewById(R.id.textView);
        Spinner first_spinner= findViewById(R.id.spinner);
        Spinner second_spinner = findViewById(R.id.spinner2);
        ConverterFacade cF = new ConverterFacade();
        cF.convert(editText,textView,first_spinner,second_spinner,this,arr);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuFacade.change_menu(item,this);
    }
}
