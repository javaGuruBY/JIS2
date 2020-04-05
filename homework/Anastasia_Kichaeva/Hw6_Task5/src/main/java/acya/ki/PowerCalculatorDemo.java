package acya.ki;

import acya.ki.bean.PowerCalculator;

public class PowerCalculatorDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new PowerCalculator());
        thread.start();
    }
}
