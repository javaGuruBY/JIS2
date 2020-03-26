package by.evgKor.service;

public class PowerCalculatorService implements Runnable {
    public static int exponentiation(int number, int power){
        for(int i=number;i<power;i++){
            System.out.println("Result: " + (int)Math. pow(number, power));
        }
        return number;
    }

    @Override
    public void run() {
        PowerCalculatorService powerCalculatorService=new PowerCalculatorService();
        powerCalculatorService.exponentiation(2,3);
    }
}
