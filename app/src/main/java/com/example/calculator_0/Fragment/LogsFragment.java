package com.example.calculator_0.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.calculator_0.Facade.NotificationFacade;
import com.example.calculator_0.R;
import com.example.calculator_0.Realisation.Logarithm;

public class LogsFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.logs_fragment, container, false);
        Button updateButton = (Button) view.findViewById(R.id.calc_button_logs);
        final EditText number_edit = view.findViewById(R.id.number_edit3);
        final EditText number_edit1 = view.findViewById(R.id.number_edit4);
        final TextView textView = view.findViewById(R.id.textResult2);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = number_edit.getText().toString();
                String val = number_edit1.getText().toString();

                if(number.isEmpty()  || val.isEmpty()){
                    Toast.makeText(getContext(), "Эй, введи данные в поле", Toast.LENGTH_SHORT).show();
                }
                else{
                    double value = Double.parseDouble(val);
                    String s = Logarithm.logs(number,value);
                    textView.setText(s);
                    NotificationFacade.notificate(getContext(),102,"Привет",R.drawable.ic_launcher_foreground,"Логарифмы:",s);
                }


                   }
        });
        return view;
    }
}
