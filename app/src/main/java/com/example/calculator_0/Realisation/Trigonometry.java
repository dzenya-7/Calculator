package com.example.calculator_0.Realisation;

public class Trigonometry {
    public static String calculateSin(String number,Angle_Measure angle_measure){
        return convertDoubleToString(Math.sin(convertToRad(convertStringToDouble(number),angle_measure)));
    }
    public static String calculateCos(String number,Angle_Measure angle_measure){
        return convertDoubleToString(Math.cos(convertToRad(convertStringToDouble(number),angle_measure)));
    }
    public static String calculateTan(String number,Angle_Measure angle_measure){
        return convertDoubleToString(Math.tan(convertToRad(convertStringToDouble(number),angle_measure)));
    }
    public static String calculateCot(String number,Angle_Measure angle_measure){
        return convertDoubleToString(1/Math.tan(convertToRad(convertStringToDouble(number),angle_measure)));
    }

    public static double convertToRad(double d,Angle_Measure measure){
        switch (measure){
            case DEGREES:{
                d/=57.29;
                break;
            }
            case GRAD:{
                d/=63.66;
                break;
            }
            case RAD:{
                d=d;
                break;
            }
        }
        return d;
    }

    public static String convertDoubleToString(double d){
        return Double.toString(d);
    }
    public static double convertStringToDouble(String number){
        return Double.parseDouble(number);
    }
}
