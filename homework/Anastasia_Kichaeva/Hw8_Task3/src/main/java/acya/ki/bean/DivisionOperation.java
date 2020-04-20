package acya.ki.bean;

public class DivisionOperation implements MathOperationI {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}
