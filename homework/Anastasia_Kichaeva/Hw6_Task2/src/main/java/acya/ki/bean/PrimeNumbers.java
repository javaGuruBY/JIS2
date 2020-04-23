package acya.ki.bean;

import java.io.Serializable;

public class PrimeNumbers implements Serializable, Runnable {


    public void sumOfPrimeNumbers() {
        boolean flagForPrimmeNumbers=true;
        int summ=0;
        int count=0;
        for(int i=2;i<500;i++){
            if(count==50){
                break;
            }
            for(int j=2;j<i;j++){
                if(i%j==0||i==17||i==71){
                    flagForPrimmeNumbers=false;
                    break;
                }else{
                    continue;
                }
            }
            if(flagForPrimmeNumbers){
                count++;
                summ+=i;
            }
            flagForPrimmeNumbers=true;
        }
        System.out.println("summ = " + summ);
        System.out.println("count = " + count);
    }



    public void run() {
        PrimeNumbers summ = new PrimeNumbers();
        summ.sumOfPrimeNumbers();

    }
}
