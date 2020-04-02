package by.evgKor.operation;

import by.evgKor.MathOperation;

public class Difference implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.println("result of difference");
        return a-b;
    }
}
