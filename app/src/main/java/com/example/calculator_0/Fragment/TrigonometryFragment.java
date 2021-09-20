package com.example.calculator_0.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.calculator_0.Facade.NotificationFacade;
import com.example.calculator_0.R;
import com.example.calculator_0.Facade.TrigonometryFacade;

public class TrigonometryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.trigonometry_fragment, container, false);
        Button updateButton = (Button) view.findViewById(R.id.button5);
        final EditText angle_edit = view.findViewById(R.id.angle_edit);
        final Spinner angle_measure_spinner = view.findViewById(R.id.angle_measure_spinner);
        final Spinner trigonometry_spinner = view.findViewById(R.id.trigonometry_spinner);

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = angle_edit.getText().toString();
                String number = trigonometry_spinner.getSelectedItem().toString();
                String function = angle_measure_spinner.getSelectedItem().toString();
                TextView textResult = view.findViewById(R.id.textResult);
                String s = TrigonometryFacade.calc(value,number,function);
                textResult.setText(s);
                NotificationFacade.notificate(getContext(),102,"",android.R.drawable.sym_def_app_icon,"Тригонометрия",s);
            }
        });
        return view;
    }
}
