package by.evgKor.operation;

import by.evgKor.MathOperation;

public class Division implements MathOperation {
    @Override
    public double compute(double a, double b) {
        System.out.println("result of division ");
        return a/b;
    }
}
