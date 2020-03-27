package com.kachenya.arrayService;

import static java.util.Arrays.sort;

public class ArrayService {
    public static void sortMyArray(int[] array){
        sort(array);
    }
    public static void swapMyArray(int[] array){
        int swap=0;
        for(int i=0;i<array.length/2;i++){
            swap=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=swap;
        }
    }

}
