package by.serg.service;


import java.util.Arrays;

public class LookupArrayService {

    public boolean isArrayEmpty(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1 && array[i] == 0) {
                return true;
            }
            if (array[i] == 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public int findMax(int[] array) {
        int maxNumber = 0;
        for (int number: array) {
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public int findMin(int[] array) {
        int minNumber = 0;
        for (int number: array) {
            if (minNumber > number) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    public int indexOfMax(int[] array) {
        int maxNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[maxNumberIndex] < array[i]) {
                maxNumberIndex = i;
            }
        }
        if(isArrayEmpty(array)) {
            maxNumberIndex = -1;
        }
        return maxNumberIndex;
    }

    public int indexOfMin(int[] array) {
        int minNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[minNumberIndex] > array[i]) {
                minNumberIndex = i;
            }
        }
        if(isArrayEmpty(array)) {
            minNumberIndex = -1;
        }
        return minNumberIndex;
    }

    public int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]){
                return i;
            }
        }
        return -1;
    }
}
