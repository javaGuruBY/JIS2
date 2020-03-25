package by.serg.bean;

import java.util.stream.IntStream;

public class PrimeNumbers implements Runnable {

    public void summOfAllNumbersFrom1To500() {
        int summ = 0;
        int simpleNumbers = 0;
        for (int i = 1; i <= 500; i++) {
            if(simpleNumbers == 50) {
                break;
            }
            if (i == 17 || i == 71) {
                continue;
            }
            summ += i;
            if (i > 1 && i <= 3) {
                simpleNumbers++;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    break;
                }
                if (j == (i-1)) {
                    simpleNumbers++;
                }
            }
        }
        System.out.println("summ =" + summ + ", count = " + simpleNumbers);
    }

    @Override
    public void run() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.summOfAllNumbersFrom1To500();
    }
}
