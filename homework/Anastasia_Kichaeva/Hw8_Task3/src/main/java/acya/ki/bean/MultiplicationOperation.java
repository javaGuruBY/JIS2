package acya.ki.bean;

public class MultiplicationOperation implements MathOperationI {
    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}
