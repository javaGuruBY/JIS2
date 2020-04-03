package by.evgKor.operation;

import by.evgKor.MathOperation;

public class Addition implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.println("result of addition ");
        return a+b;
    }
}
