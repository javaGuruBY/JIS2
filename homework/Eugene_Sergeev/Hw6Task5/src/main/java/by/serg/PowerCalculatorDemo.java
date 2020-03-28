package by.serg;

import by.serg.bean.PowerCalculator;

public class PowerCalculatorDemo {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println(powerCalculator.exponentiation(5, 3));
        System.out.println(powerCalculator.exponentiation(10, 5));
    }
}
