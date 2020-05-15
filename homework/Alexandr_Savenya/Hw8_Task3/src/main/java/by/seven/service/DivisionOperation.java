package by.seven.service;

import by.seven.interfaces.MathOperations;

public class DivisionOperation implements MathOperations {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}
