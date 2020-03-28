package by.evgKor.service;

import java.util.Arrays;

public class ArrayService implements Runnable {

    public void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void swap(int[] arrays) {

        for ( int i = 0, j = arrays.length - 1; i < j; ++i, --j ){
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
            }
        System.out.println(Arrays.toString(arrays));
    }




    @Override
    public void run() {
        int[] array = {7, 2, 8, 4, 5, 1};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(array);
        arrayService.swap(array);
    }
}


