package acya.ki.bean;

public class PowerCalculator implements Runnable{

    public int exponentiation(int targetNum, int targetPower) {
        int result = 1;
        if (targetNum < 0 || targetPower < 0) {
            System.out.println("Exception! Operation is possible only with positive numbers.");
        } else {
            for (int i = 1; i <= targetPower; i++) {
                result = result * targetNum;
            }
        }
        System.out.println(result);
        return result;

    }

    public void run() {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.exponentiation(2, 3);

    }
}
