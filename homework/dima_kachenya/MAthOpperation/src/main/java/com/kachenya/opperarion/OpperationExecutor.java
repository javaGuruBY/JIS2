package com.kachenya.opperarion;

import com.kachenya.mathOpp.MathOpperation;

public class OpperationExecutor {
    public void execute(MathOpperation[] opperations,double a,double b){
        for (MathOpperation item:
             opperations) {
            System.out.println("item.computer(a,b) = " + item.computer(a, b));
        }
    }
}
