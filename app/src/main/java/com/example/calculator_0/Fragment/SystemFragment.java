package com.example.calculator_0.Fragment;

import android.app.Fragment;
import android.app.Notification;
import android.app.NotificationManager;
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
import androidx.core.app.NotificationCompat;

import com.example.calculator_0.Facade.NotificationFacade;
import com.example.calculator_0.R;
import com.example.calculator_0.Realisation.Convertation;

import static android.content.Context.NOTIFICATION_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;

public class SystemFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.system_fragment, container, false);
        Button calc_button = (Button) view.findViewById(R.id.calc_button);
        final EditText number_edit2 = view.findViewById(R.id.number_edit2);
        final Spinner system_spinner = view.findViewById(R.id.system_spinner);
        final TextView textResult = view.findViewById(R.id.textResult2);
        final Spinner spinner3 = view.findViewById(R.id.spinner3);

        calc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = number_edit2.getText().toString();
                int number = Integer.parseInt(system_spinner.getSelectedItem().toString());
                double d = Double.parseDouble(spinner3.getSelectedItem().toString());
                String s = Convertation.convert(value,d,number);
                NotificationFacade.notificate(getContext(),103,"",R.drawable.ic_launcher_foreground,"Системы счисления:","Привет");
                textResult.setText(s);
            }
        });
        return view;
    }

}
