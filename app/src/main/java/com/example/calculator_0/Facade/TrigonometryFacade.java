package com.example.calculator_0.Facade;

import com.example.calculator_0.Realisation.Angle_Measure;
import com.example.calculator_0.Realisation.Trigonometry;

public class TrigonometryFacade {
    public static String calc(String value,String number,String function) {
        Angle_Measure angle_measure = null;
        switch (number) {
            case "Градусы": {
                angle_measure = Angle_Measure.DEGREES;
                break;
            }
            case "Радианы": {
                angle_measure = Angle_Measure.RAD;
                break;
            }
            case "Грады": {
                angle_measure = Angle_Measure.GRAD;
                break;
            }
        }

        String result = "";
        switch (function) {
            case "Синус": {
                result = Trigonometry.calculateSin(value, angle_measure);
                break;
            }
            case "Косинус": {
                result = Trigonometry.calculateCos(value, angle_measure);
                break;
            }
            case "Тангенс": {
                result = Trigonometry.calculateTan(value, angle_measure);
                break;
            }
            case "Котангенс": {
                result = Trigonometry.calculateCot(value, angle_measure);
                break;
            }
        }
        return result;
    }
}
