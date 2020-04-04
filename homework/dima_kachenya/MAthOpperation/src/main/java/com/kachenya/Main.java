package com.kachenya;

import com.kachenya.mathOpp.MathOpperation;
import com.kachenya.opperarion.*;

public class Main {
    public static void main(String[] args) {
        MathOpperation[] ops={
                new Add(),
                new Diff(),
                new Star(),
                new Div()
        };
        OpperationExecutor executor=new OpperationExecutor();
        executor.execute(ops,5,3);
    }
}
