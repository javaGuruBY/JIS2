package by.alhr.Hw6_Task5_PowerCalculator.service;

public class PowerCalculatorService implements Runnable{
    public int exponentiation(int number,int power){
        int result=1;
        if(number<0||power<0){
            System.out.println("Expection, all numbers should be positive");
        }else{
            for(int i=1;i<=power;i++){
                result = result * number;
            }
        }
        System.out.println("Result  = " + result);
        return result;
    }

    @Override
    public void run() {
        PowerCalculatorService powerCalculatorService=new PowerCalculatorService();
        powerCalculatorService.exponentiation(3,4);
    }
}
