package by.alhr.Hw6_Task2_SumPrimeNumbers.service;

public class PrimeNumbers implements Runnable{
    public void sumOfPrimeNumbers() {
        boolean primmeNumbers=true;
        int summ=0;
        int count=0;
        for(int i=2;i<500;i++){
            if(count==50){
                break;
            }
            for(int j=2;j<i;j++){
                if(i%j==0||i==17||i==71){
                    primmeNumbers=false;
                    break;
                }else{
                    continue;
                }
            }
            if(primmeNumbers){
                count++;
                summ+=i;
            }
            primmeNumbers=true;
        }
        System.out.println("summ = " + summ);
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        PrimeNumbers summ = new PrimeNumbers();
        summ.sumOfPrimeNumbers();
    }

}
