package com.kachenya;

public class NumberService {
    public static int rangeSum(int start, int finish) {
        int swap;
        if (start > finish) {
            swap = start;
            start = finish;
            finish = swap;
        }
        int sum = 0;
        for (; start <= finish; start++) {
            sum += start;
        }
        return sum;
    }

    public static int rangeEvenCount(int start, int finish) {
        int swap;
        int counter=0;
        if (start > finish) {
            swap = start;
            start = finish;
            finish = swap;
        }
        for (;start<=finish;start++)
        {
            if(start%2==0){
                counter++;
            }
        }
        return counter;
    }

}
