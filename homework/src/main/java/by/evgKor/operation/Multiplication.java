package by.evgKor.operation;

import by.evgKor.MathOperation;

public class Multiplication implements MathOperation {
    @Override
    public double compute(double a, double b) {
        System.out.println("result of multiplication");
        return a*b;
    }
}
