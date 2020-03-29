package by.evgKor.service;

public class NumberService {
    public static int rangeSum(int start, int finish) {
    int sum = 0;
    if (start < finish) {
        for (int i = start; start <= finish; start++) {
            sum += start;
        }
    }else{
        for (int i = start; start >= finish; start--) {
            sum += start;
        }
    }
    return sum;
}

    public static int rangeEvenCount(int start, int finish) {
        int count = 0;
        if (start < finish) {
            for (int i=start; start <= finish; start++) {
                if (start % 2 == 0) {
                    count++;
                }
            }
        }else{
            for (int i=start; start >= finish; start--) {
                if (start % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
