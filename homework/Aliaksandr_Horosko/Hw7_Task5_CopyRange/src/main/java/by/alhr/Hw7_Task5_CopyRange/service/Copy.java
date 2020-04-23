package by.alhr.Hw7_Task5_CopyRange.service;

import java.util.Arrays;

public class Copy implements Runnable {
    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
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
        int[] array = {40, 75, 23, 36, 87, 95, 54, 11, 62};
        System.out.println(Arrays.toString(array));
        Copy copyService = new Copy();
        int[] out=copyService.copyInRange(array, 30, 75);
        System.out.println(Arrays.toString(out));

    }
}
