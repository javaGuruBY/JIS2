package by.evgKor.service;

import java.util.Arrays;

public class CopyService implements Runnable {

    public static int[] copyInRange(int in[], int leftBound, int rightBound) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                count++;
            }
        }
        int[] finalArray = new int[count];
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                finalArray[index] = in[i];
                index++;
            }

        }
        return finalArray;
    }


    @Override
    public void run() {
        int[] a1 = {22, 56, 78, 10, 7, 16, 45, 50};
        System.out.println(Arrays.toString(a1));
        CopyService copyService = new CopyService();
        int[] out=copyService.copyInRange(a1, 10, 45);
        System.out.println(Arrays.toString(out));


    }
}