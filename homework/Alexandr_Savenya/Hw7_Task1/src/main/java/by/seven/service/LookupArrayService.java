package by.seven.service;

import java.io.Serializable;

public class LookupArrayService implements Serializable, Runnable {

        public boolean isArrayEmpty(int[] array) {
            if (array.length == 0) {
                return true;
            }
            return false;
        }

        public int findMax(int[] array) {
            int max;
            if (isArrayEmpty(array)) {
                max = 0;
            } else {
                max = array[0];
                for (int i = 0; i < array.length; i++) {
                    if (max < array[i])
                        max = i;
                }
            }
            System.out.println("Max number:" + max);
            return max;
        }

        public int findMin(int[] array) {
            int min;
            if(isArrayEmpty(array)) {
                min = 0;
            } else {
                min = array[0];
                for (int i = 0; i < array.length; i++) {
                    if (min > array[i])
                        min = i;
                    }
                }
                System.out.println("Min number:" + min);
                return min;
            }

        public int indexOfMax(int[] array) {
            int indexOfMax = 0;
            if (isArrayEmpty(array)) {
                indexOfMax = -1;
            } else {
                for (int i = 0; i < array.length; i++) {
                    if ( array[i] <array[indexOfMax]) {
                        indexOfMax = i;
                    }
                }
            }
            System.out.println("Index of Max number: " + indexOfMax);
            return indexOfMax;
        }
        public int indexOfMin(int[] array) {
            int indexOfMin;
            if (isArrayEmpty(array)) {
                indexOfMin = -1;
            } else {
                indexOfMin = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > array[indexOfMin]) {
                        indexOfMin = i;
                    }
                }
            }
            System.out.println("Index of Min number: " + indexOfMin);
            return indexOfMin;
        }

        public int indexOf(int[] array, int value) {
            int index ;
            if (isArrayEmpty(array)) {
                index = -1;
            } else {
                index = 0;
                for (int i = 0; i <array.length; i++) {
                    if (array[i] == value) {
                        index = i;
                        break;
                    }
                }
            }
            System.out.println("Index of set number:" + index);
            return index;
        }



    public void run() {
            LookupArrayService lookupArrayService = new LookupArrayService();
            int[] array1 = {14,15,4,45,31};
            int[] array2 = {};
            int[] array3 = {1,4,6,7,4,2};
            lookupArrayService.isArrayEmpty(array1);
            lookupArrayService.isArrayEmpty(array2);
            lookupArrayService.isArrayEmpty(array3);
            lookupArrayService.findMax(array1);
            lookupArrayService.findMax(array2);
            lookupArrayService.findMax(array3);
            lookupArrayService.findMin(array1);
            lookupArrayService.findMin(array2);
            lookupArrayService.findMin(array3);
            lookupArrayService.indexOfMax(array1);
            lookupArrayService.indexOfMax(array2);
            lookupArrayService.indexOfMax(array3);
            lookupArrayService.indexOfMin(array1);
            lookupArrayService.indexOfMin(array2);
            lookupArrayService.indexOfMin(array3);
            lookupArrayService.indexOf(array1, 31);
            lookupArrayService.indexOf(array2, 3);
            lookupArrayService.indexOf(array3, 4);

    }
}
