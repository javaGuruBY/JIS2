package acya.ki.service;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayService2 implements Serializable, Runnable {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
    }

    public void swap(int[] array) {
        int swapNum = array.length;
        int temp;
        for (int i = 0; i < swapNum / 2; i++) {
            temp = array[swapNum - i - 1];
            array[swapNum - i - 1] = array[i];
            array[i] = temp;
        }
    }


    public void run() {
        int[] array1 = {4, 7, 2, 3, 8, 9, 5, 1, 6};
        int[] array2 = {1, 3, 8, 5, 4, 7, 9, 6, 2};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        ArrayService2 arrayService2 = new ArrayService2();
        arrayService2.sort(array1);
        arrayService2.swap(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
}
