package com.example.calculator_0.Realisation;

public class Logarithm {
    public static String logs(String value,double number) {

        String result = "";

        if (number == 10.0) {
            double d = Math.log10(Double.parseDouble(value));
            result =  Double.toString(d);
        } else if(number == Math.E) {
            double d = Math.log(Double.parseDouble(value));
            result =  Double.toString(d);
        }
        else {
            double d= Double.parseDouble(value);
            result = Double.toString(Math.log10(d)/Math.log10(number));
        }
            return result;
        }
    }
