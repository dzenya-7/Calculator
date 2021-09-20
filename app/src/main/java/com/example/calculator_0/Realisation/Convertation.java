package com.example.calculator_0.Realisation;

import java.math.BigInteger;

public class Convertation {
    public  static String convert(String value,double number,int num){
        BigInteger sum = BigInteger.valueOf(0);
        sum = sum.add(new BigInteger(value,num));
        String s=sum.toString((int)number);
        return s;
    }
}
