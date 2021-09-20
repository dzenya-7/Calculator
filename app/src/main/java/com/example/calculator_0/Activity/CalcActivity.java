package com.example.calculator_0.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.calculator_0.Fragment.LogsFragment;
import com.example.calculator_0.Fragment.SystemFragment;
import com.example.calculator_0.FragmentVisitor;
import com.example.calculator_0.Facade.MenuFacade;
import com.example.calculator_0.R;
import com.example.calculator_0.Fragment.TrigonometryFragment;
import com.example.calculator_0.Visitor;

public class CalcActivity extends AppCompatActivity {
    final static String TAG_1 = "FRAGMENT_1",TAG_2 = "FRAGMENT_2",TAG_3 = "FRAGMENT_3";
    final static String KEY_MSG_3 = "FRAGMENT3_MSG",KEY_MSG_1 = "FRAGMENT1_MSG",KEY_MSG_2 = "FRAGMENT2_MSG";
    public MenuItem item;
    FrameLayout container;
    FragmentManager myFragmentManager;
    TrigonometryFragment myFragment1;SystemFragment myFragment2;LogsFragment myFragment3;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        Button button1 = findViewById(R.id.button6),button2 = findViewById(R.id.button7),button3 = findViewById(R.id.button8);
        container = (FrameLayout) findViewById(R.id.container);
        myFragmentManager = getFragmentManager();
        myFragment1 = new TrigonometryFragment();
        myFragment2 = new SystemFragment();
        myFragment3 = new LogsFragment();

        if (savedInstanceState == null) {
            Visitor visitor = new FragmentVisitor();
            visitor.visit(myFragment1,TAG_1,KEY_MSG_1,R.id.container,this,myFragmentManager);
        }
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
    @SuppressLint("ResourceType")
    public void toTrigonometry(View view) {
        Visitor visitor = new FragmentVisitor();
        visitor.visit(myFragment1,TAG_1,KEY_MSG_1,R.id.container,this,myFragmentManager);
    }
    @SuppressLint("ResourceType")
    public void toSystem(View view) {
        Visitor visitor = new FragmentVisitor();
        visitor.visit(myFragment2,TAG_2,KEY_MSG_2,R.id.container,this,myFragmentManager);
    }
    @SuppressLint("ResourceType")
    public void toLogs(View view) {
        Visitor visitor = new FragmentVisitor();
        visitor.visit(myFragment3,TAG_3,KEY_MSG_3,R.id.container,this,myFragmentManager);
    }
}