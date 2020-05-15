package by.seven.service;

import java.util.Arrays;

public class Copy implements Runnable {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <in.length; i++){
            if (in[i] >= leftBound && in[i] <= rightBound) {
                count1++;
            }
        }
        int[] out = new int[count1];
        for (int i = 0; i <in.length; i++){
            if ( in[i] >= leftBound && in[i] <= rightBound) {
               out[count2] = in[i];
               count2++;
            }
        }return  out;
    }

    public void run() {
        int[] array ={14, 16, 14, 4, 6, 23, 67, 34, 87, 1, 11};
        System.out.println(Arrays.toString(array));
        Copy copy = new Copy();
        int[] out = copy.copyInRange(array, 15, 55);
        System.out.println(Arrays.toString(out));
    }
}
