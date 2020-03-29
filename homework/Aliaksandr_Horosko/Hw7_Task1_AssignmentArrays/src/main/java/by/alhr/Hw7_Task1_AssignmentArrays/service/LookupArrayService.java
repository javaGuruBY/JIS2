package by.alhr.Hw7_Task1_AssignmentArrays.service;

public class LookupArrayService implements Runnable{

    int array [] = {25,546,555,268,952};

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number= " + max);
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number = " + min);
        return min;
    }

    public int indexOfMax(int[] array) {
        int maxIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIdx] < array[i]) {
                maxIdx = i;
            }
        }
        System.out.println("Idx of max number = " + maxIdx);
        return maxIdx;
    }
    public int indexOfMin(int[] array){
        int minIdx=0;
        for(int i=0;i< array.length;i++){
            if(array[minIdx]>array[i]){
                minIdx=i;
            }
        }
        System.out.println("Idx of min = "+minIdx);
        return minIdx;
    }
    public int indexOf(int[] array, int value){
        int ofIdx=0;
        for(int i=0; i<array.length; i++){
            if(array[i]==value){
                ofIdx=i;
            }
        }
        System.out.println("Idx of value numb = "+ofIdx);
        return ofIdx;
    }

    @Override
    public void run() {
        LookupArrayService lookupArrayService = new LookupArrayService();
        lookupArrayService.findMax(array);
        lookupArrayService.findMin(array);
        lookupArrayService.indexOfMax(array);
        lookupArrayService.indexOfMin(array);
        lookupArrayService.indexOf(array,268);


    }
}
