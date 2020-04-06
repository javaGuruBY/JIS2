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

    public int indexOfMax(int[] array) { ;
        int indexForMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (isArrayEmpty(array)) {
                indexForMax = -1;
            }else if(array[i] > array[indexForMax]){
                indexForMax = i;
            }
        }
        System.out.println(indexForMax);
        return indexForMax;
    }

    public int indexOfMin(int[] array) {
        int indexForMin = 0;
        for(int i = 0; i < array.length; i++){
            if(isArrayEmpty(array)){
                indexForMin = -1;
            }else if(array[i] < array[indexForMin]){
                indexForMin = i;
            }
        }
        System.out.println(indexForMin);
        return indexForMin;
    }

    public int indexOf(int[] array, int value) {
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if (isArrayEmpty(array)) {
                index = -1;
            } else if(array[i] == value){
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
        lookupArrayService.indexOf(array1, 88);
        lookupArrayService.indexOf(array2, 88);


    }
}
