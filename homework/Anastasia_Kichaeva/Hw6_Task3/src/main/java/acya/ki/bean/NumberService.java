package acya.ki.bean;

import java.io.Serializable;

public class NumberService implements Serializable, Runnable {

    public int rangeSum(int start, int finish) {
        int rangeSum = 0;
        if(start > finish){
            for(int i = start; i >= finish; i--){
                System.out.print(i);
                rangeSum += i;

            }
        }else {
            for(int i = start; i <= finish; i++){
                System.out.print(i);
                rangeSum += i;
            }
        }
        System.out.println(" = " + rangeSum);
        return rangeSum;

    }

    public int rangeEvenCount(int start, int finish) {
        int rangeEvenCount = 0;
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0) {
                    System.out.print(i);
                    rangeEvenCount++;
                }else {
                    continue;
                }
            }

        }else {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                    rangeEvenCount++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(" => " + rangeEvenCount);
        return rangeEvenCount;
    }




    public void run() {
        NumberService numberService = new NumberService();
        numberService.rangeSum(3, 7);
        numberService.rangeSum(7, 3);
        numberService.rangeEvenCount(2, 9);
        numberService.rangeEvenCount(9, 2);

    }
}
