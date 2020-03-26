package by.serg.service;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int rangeSum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                rangeSum += i;
            }
            return rangeSum;
        } else {
            for (int i = finish; i <= start; i++) {
                rangeSum += i;
            }
            return rangeSum;
        }
    }

    public int rangeEvenCount(int start, int finish) {
        int evenNumbers = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i%2 == 0) {
                    evenNumbers += 1;
                }
            }
            return evenNumbers;
        } else {
            for (int i = finish; i <= start; i++) {
                if (i%2 == 0) {
                    evenNumbers += 1;
                }
            }
            return evenNumbers;
        }
    }
}
