package com.kachenya.primenumbers;

public class PrimeNumbers {

    public static void prineNumbers(){
        boolean flagForPrimmeNumbers=true;
        int summOfPrimeNumbers=0;
        int counretOfNumbers=0;
        for(int i=2;i<500;i++){
            if(counretOfNumbers==50){
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
                counretOfNumbers++;
                summOfPrimeNumbers+=i;
            }
            flagForPrimmeNumbers=true;
        }
        System.out.println("summOfPrimeNumbers = " + summOfPrimeNumbers);
        System.out.println("counretOfNumbers = " + counretOfNumbers);
    }
}
