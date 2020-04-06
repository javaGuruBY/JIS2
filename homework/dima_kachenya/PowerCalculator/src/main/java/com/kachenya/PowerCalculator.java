package com.kachenya;

public class PowerCalculator {
    public static int pow(int number,int power){
        int numberInPover=number;
        for (int i=2;i<=power;i++){
           numberInPover*=number;
        }
        return numberInPover;
    }
}
