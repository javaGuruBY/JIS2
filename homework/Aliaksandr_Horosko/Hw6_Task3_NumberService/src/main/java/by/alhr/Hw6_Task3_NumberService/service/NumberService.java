package by.alhr.Hw6_Task3_NumberService.service;

public class NumberService {
    public static int rangeSum(int start, int finish) {
        int myInt;
        if (start > finish) {
            myInt = start;
            start = finish;
            finish = myInt;
        }
        int sum = 0;
        for (; start <= finish; start++) {
            sum += start;
        }
        return sum;
    }

    public static int rangeEvenCount(int start, int finish) {
        int myInt;
        int counter=0;
        if (start > finish) {
            myInt = start;
            start = finish;
            finish = myInt;
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
