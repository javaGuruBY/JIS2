package by.serg.bean;

public class PowerCalculator {

    public int exponentiation(int base, int degree) {
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= base;
        }
        return result;
    }
}
