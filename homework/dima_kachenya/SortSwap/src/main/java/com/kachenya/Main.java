package com.kachenya;

import com.kachenya.arrayService.ArrayService;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        int[]array={2,41,12,5,3,2,3,5,5,3,1,};
        ArrayService.sortMyArray(array);
        for (int item:
             array) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        ArrayService.swapMyArray(array);
        for (int item:
             array) {
            System.out.println(item);
        }

    }
}
