package by.alhr.Hw7_Task1_WorkWithArrays.service;

import by.alhr.Hw7_Task1_WorkWithArrays.bean.LookupArray;

public class LookupArrayService implements Runnable {


    public int findMax(LookupArray lookupArray) {

        int max;
        if (lookupArray.emptyArray(lookupArray.getMyArray())) {
            max = 0;
        } else {
            max = lookupArray.getMyArray()[0];
            for (int i = 0; i < lookupArray.getMyArray().length; i++) {
                if (lookupArray.getMyArray()[i] > max) {
                    max = lookupArray.getMyArray()[i];
                }
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    public int findMin(LookupArray lookupArray) {
        int min;
        if (lookupArray.emptyArray(lookupArray.getMyArray())) {
            min = 0;
        } else {
            min = lookupArray.getMyArray()[0];
            for (int i = 0; i < lookupArray.getMyArray().length; i++) {
                if (lookupArray.getMyArray()[i] < min) {
                    min = lookupArray.getMyArray()[i];
                }
            }
        }
        System.out.println("min = " + min);
        return min;
    }

    public int indexOfMax(LookupArray lookupArray) {
        int idxMax;
        if (lookupArray.emptyArray(lookupArray.getMyArray())) {
            idxMax = -1;
        } else {
            idxMax = 0;
            for (int i = 0; i < lookupArray.getMyArray().length; i++) {
                if (lookupArray.getMyArray()[idxMax] < lookupArray.getMyArray()[i]) {
                    idxMax = i;
                }
            }

        }
        System.out.println("indexOfMax = " + idxMax);
        return idxMax;
    }

    public int indexOfMin(LookupArray lookupArray) {
        int idxMin;
        if (lookupArray.emptyArray(lookupArray.getMyArray())) {
            idxMin = -1;
        } else {
            idxMin = 0;
            for (int i = 0; i < lookupArray.getMyArray().length; i++) {
                if (lookupArray.getMyArray()[idxMin] > lookupArray.getMyArray()[i]) {
                    idxMin = i;
                }
            }
        }
        System.out.println("indexOfMin = " + idxMin);
        return idxMin;

    }

    public int indexOf(LookupArray lookupArray) {
        int idx;
        if (lookupArray.emptyArray(lookupArray.getMyArray())) {
            idx = -1;
        } else {
            idx = 0;
            for (int i = 0; i < lookupArray.getMyArray().length; i++) {
                if (lookupArray.getMyArray()[i] == lookupArray.getValue()) {
                    idx = i;
                    break;
                }
            }

        }
        System.out.println("IndexOf = " + idx);
        return idx;

    }

    @Override
    public void run() {
        LookupArray lookupArray = new LookupArray(new int[]{18, 228, 25, 548, 25, 548}, 25);
        LookupArray lookupArray1 = new LookupArray(new int[]{}, 25);

        LookupArrayService lookupArrayService = new LookupArrayService();

        lookupArrayService.findMax(lookupArray);
        lookupArrayService.findMin(lookupArray);
        lookupArrayService.indexOfMax(lookupArray);
        lookupArrayService.indexOfMin(lookupArray);
        lookupArrayService.indexOf(lookupArray);
        System.out.println();
        lookupArrayService.findMax(lookupArray1);
        lookupArrayService.findMin(lookupArray1);
        lookupArrayService.indexOfMax(lookupArray1);
        lookupArrayService.indexOfMin(lookupArray1);
        lookupArrayService.indexOf(lookupArray1);

    }
}
