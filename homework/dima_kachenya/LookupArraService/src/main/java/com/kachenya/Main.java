package com.kachenya;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 10, 2, 6, 10, 3};
        System.out.println("LookupArrayService.findMax(array) = " + LookupArrayService.findMax(array));
        System.out.println("LookupArrayService.findeMin(array) = " + LookupArrayService.findMin(array));
        System.out.println("Index/es of max:");
        for (int item :
                LookupArrayService.indexOfMax(array)) {
            System.out.println(item);
        }
        System.out.println("Index/es of min:");
        for (int item :
                LookupArrayService.indexOfMin(array)) {
            System.out.println(item);
        }

        System.out.println("LookupArrayService.indexOf(array,10) = " + LookupArrayService.indexOf(array, 10));
    }


}
