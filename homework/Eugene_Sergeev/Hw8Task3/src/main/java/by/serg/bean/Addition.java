package by.serg.bean;

import by.serg.interfaces.MathOperation;

public class Addition implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a+b;
    }
}
