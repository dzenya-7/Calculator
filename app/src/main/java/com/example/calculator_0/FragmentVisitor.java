package com.example.calculator_0;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;


import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.example.calculator_0.Fragment.LogsFragment;
import com.example.calculator_0.Fragment.SystemFragment;
import com.example.calculator_0.Fragment.TrigonometryFragment;

public  class FragmentVisitor implements Visitor {

    @Override
    public void visit(TrigonometryFragment trigonometryFragment, String TAG, String MSG, int id, Context context, FragmentManager fragmentManager) {
        TrigonometryFragment fragment1 = (TrigonometryFragment) fragmentManager
                .findFragmentByTag(TAG);

        if (fragment1 == null) {

            Bundle bundle = new Bundle();
            bundle.putString(MSG, "Заменили на первый фрагмент");
            trigonometryFragment.setArguments(bundle);

            FragmentTransaction fragmentTransaction = fragmentManager
                    .beginTransaction();
            fragmentTransaction.replace(id, trigonometryFragment,
                    TAG);
            fragmentTransaction.commit();

        } else {
            Toast.makeText(context, "Выбранный фрагмент уже загружен", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void visit(LogsFragment logsFragment, String TAG, String MSG, int id, Context context, FragmentManager fragmentManager) {
        LogsFragment fragment3 = (LogsFragment) fragmentManager
                .findFragmentByTag(TAG);

        if (fragment3 == null) {
            Bundle bundle = new Bundle();
            bundle.putString(MSG, "Заменили на третий фрагмент");
            logsFragment.setArguments(bundle);
            FragmentTransaction fragmentTransaction = fragmentManager
                    .beginTransaction();
            fragmentTransaction.replace(id, logsFragment,
                    TAG);
            fragmentTransaction.commit();

        } else {
            Toast.makeText(context, "Выбранный фрагмент уже загружен", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void visit(SystemFragment systemFragment, String TAG, String MSG, int id, Context context, FragmentManager fragmentManager) {
        SystemFragment fragment2 =(SystemFragment) fragmentManager
                .findFragmentByTag(TAG);

        if (fragment2 == null) {

            Bundle bundle = new Bundle();
            bundle.putString(MSG, "Заменили на второй фрагмент");
            systemFragment.setArguments(bundle);

            FragmentTransaction fragmentTransaction = fragmentManager
                    .beginTransaction();
            fragmentTransaction.replace(id, systemFragment,
                    TAG);
            fragmentTransaction.commit();

        } else {
            Toast.makeText(context, "Выбранный фрагмент уже загружен", Toast.LENGTH_SHORT).show();
        }
    }
}
