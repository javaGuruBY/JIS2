package acya.ki.bean;

public class AdditionOperation implements MathOperationI{
    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}
