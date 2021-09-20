package com.example.calculator_0;

import android.content.Context;

import androidx.annotation.IdRes;
import androidx.fragment.app.FragmentManager;

import com.example.calculator_0.Fragment.LogsFragment;
import com.example.calculator_0.Fragment.SystemFragment;
import com.example.calculator_0.Fragment.TrigonometryFragment;

public interface Visitor {

    void visit(TrigonometryFragment trigonometryFragment, String TAG, String MSG, int id, Context context, android.app.FragmentManager fragmentManager);

    void visit(LogsFragment logsFragment, String TAG, String MSG, int id, Context context, android.app.FragmentManager fragmentManager);

    void visit(SystemFragment systemFragment, String TAG, String MSG, int id, Context context, android.app.FragmentManager fragmentManager);
}
