package by.evgKor.service;

public class PowerCalculatorService implements Runnable {
    public int exponentiation(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            if (number < 0 || power < 0) {
                System.out.println("Error, all numbers should be positive");
            } else {
                result = (int)Math.pow(number,power);
            }
        }
        System.out.println("Result of calculation = " + result);
        return result;
    }

    @Override
    public void run() {
        PowerCalculatorService powerCalculatorService = new PowerCalculatorService();
        powerCalculatorService.exponentiation(2, 6);
    }
}
