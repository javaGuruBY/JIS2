package by.alhr.Hw8_Task3_MathOperation.bean;

import by.alhr.Hw8_Task3_MathOperation.interfaces.MathOperation;

public class MultiplicationOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.print("Умножение = ");
        return a * b;
    }
}
