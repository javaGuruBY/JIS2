package by.alhr.Hw7_Task1_WorkWithArrays.service;

import by.alhr.Hw7_Task1_WorkWithArrays.bean.LookupArray;

public class LookupArrayService implements Runnable {

    public int findMax(LookupArray lookupArray) {
        int max = lookupArray.getMyArray()[0];
        if (lookupArray.equals(lookupArray.getMyArray())) {
            max = 0;
        }
        for (int i = 0; i < lookupArray.getMyArray().length; i++) {
            if (lookupArray.getMyArray()[i] > max) {
                max = lookupArray.getMyArray()[i];
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    public int findMin(LookupArray lookupArray) {
        int min = lookupArray.getMyArray()[0];
        if (lookupArray.equals(lookupArray.getMyArray())) {
            min = 0;
        }

        for (int i = 0; i < lookupArray.getMyArray().length; i++) {
            if (lookupArray.getMyArray()[i] < min) {
                min = lookupArray.getMyArray()[i];
            }
        }
        System.out.println("min = " + min);
        return min;
    }

    public int indexOfMax(LookupArray lookupArray) {
        int indexMax = 0;
        if (lookupArray.isArrayEmpty(lookupArray.getMyArray())){
            indexMax = -1;
        }
        for (int i = 0; i < lookupArray.getMyArray().length; i++) {
            if (lookupArray.getMyArray()[indexMax] < lookupArray.getMyArray()[i]) {
                indexMax = i;
            }

        }
        System.out.println("indexOfMax = " + indexMax);
        return indexMax;
    }

    public int indexOfMin(LookupArray lookupArray) {
        int indexMin = 0;
        if (lookupArray.equals(lookupArray.getMyArray())) {
            indexMin = -1;
        }
        for (int i = 0; i < lookupArray.getMyArray().length; i++) {
            if (lookupArray.getMyArray()[indexMin] > lookupArray.getMyArray()[i]) {
                indexMin = i;
            }
        }
        System.out.println("indexOfMin = " + indexMin);
        return indexMin;

    }

    public int indexOf(LookupArray lookupArray) {
        int index = 0;
        if (lookupArray.equals(lookupArray.getMyArray())){
            index = -1;
        }
        for (int i = 0; i < lookupArray.getMyArray().length; i++) {
            if (lookupArray.getMyArray()[i] == lookupArray.getValue()){
                index = i;
                break;
            }

        }
        System.out.println("IndexOf = " + index);
        return index;

    }

    @Override
    public void run() {
        LookupArray lookupArray = new LookupArray(new int[]{125,228,25,548,18,97}, 25);
        LookupArrayService lookupArrayService = new LookupArrayService();
        lookupArrayService.findMax(lookupArray);
        lookupArrayService.findMin(lookupArray);
        lookupArrayService.indexOfMax(lookupArray);
        lookupArrayService.indexOfMin(lookupArray);
        lookupArrayService.indexOf(lookupArray);

    }
}
