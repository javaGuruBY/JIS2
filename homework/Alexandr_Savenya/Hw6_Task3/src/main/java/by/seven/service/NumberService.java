package by.seven.service;

import java.io.Serializable;

public class NumberService implements Serializable, Runnable {

    public int rangeSum(int start , int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; start <= finish; start++) {
                sum += start;
               if (start == finish){
                        System.out.print(start);
                    }else {
                        System.out.print(start + " + ");
                }
            }
        }else {
            for (int i = start; start >= finish; start--) {
                sum += start;
                if (start == finish){
                    System.out.print(start);
                }else {
                    System.out.print(start + " + ");
                }
            }
        }
        System.out.println(" = " + sum);
        return sum;

    }
    public int rangeEvenCount(int start, int finish) {
        int count = 0;
        if (start < finish) {
            for (int i = start; start <= finish; start++) {
                if (start % 2 == 0) {
                    count++;
                    if (start + 1 == finish) {
                        System.out.print(start + " => ");
                    } else {
                        System.out.print(start + ", ");
                    }
                }
            }
        }
        else {
            for (int i = start; start >= finish; start--) {
                if (start % 2 == 0) {
                    count++;
                    if (start == finish) {
                        System.out.print(start + " => ");
                    } else {
                        System.out.print(start + ", ");
                    }
                }
            }
        } System.out.println(count);
        return count;
    }

    public void run() {
        NumberService numberService = new NumberService();
        numberService.rangeSum(3,7);
        numberService.rangeSum(7,3);
        numberService.rangeEvenCount(3,11);
        numberService.rangeEvenCount(28,18);


    }
}
