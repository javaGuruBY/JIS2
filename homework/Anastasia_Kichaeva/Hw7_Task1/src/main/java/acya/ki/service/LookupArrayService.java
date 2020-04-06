package acya.ki.service;

import java.io.Serializable;
import java.util.ArrayList;

public class LookupArrayService implements Serializable, Runnable {

    public boolean isArrayEmpty(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
        return min;
    }

    public int indexOfMax(int[] array) {
        int indexForMax = 0;
        if (isArrayEmpty(array)) {
            indexForMax = -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[indexForMax]){
                indexForMax = i;
            }
        }
        System.out.println(indexForMax);
        return indexForMax;
    }

    public int indexOfMin(int[] array) {
        int indexForMin = 0;
        if(isArrayEmpty(array)) {
            indexForMin = -1;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[indexForMin]){
                indexForMin = i;
            }
        }
        System.out.println(indexForMin);
        return indexForMin;
    }

    public int indexOf(int[] array, int value) {
        int index = 0;
        if (isArrayEmpty(array)) {
            index = -1;
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
        }
        System.out.println(index);
        return index;
    }

    public void run() {
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] array1 = {4, 88, 404, 88, 12, 88, 1};
        int[] array2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        lookupArrayService.isArrayEmpty(array1);
        lookupArrayService.isArrayEmpty(array2);

        lookupArrayService.findMax(array1);
        lookupArrayService.findMax(array2);

        lookupArrayService.findMin(array1);
        lookupArrayService.findMin(array2);

        lookupArrayService.indexOfMax(array1);
        lookupArrayService.indexOfMax(array2);

        lookupArrayService.indexOfMin(array1);
        lookupArrayService.indexOfMin(array2);

        lookupArrayService.indexOf(array1, 88);
        lookupArrayService.indexOf(array2, 88);
    }
}
