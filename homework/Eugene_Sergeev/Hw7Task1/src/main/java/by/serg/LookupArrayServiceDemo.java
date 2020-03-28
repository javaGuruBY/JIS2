package by.serg;

import by.serg.service.LookupArrayService;

import java.util.Arrays;

public class LookupArrayServiceDemo {
    public static void main(String[] args) {
        int[] array = {-4,3,-1,10,-5,0};
        LookupArrayService lookupArrayService = new LookupArrayService();
        System.out.println("Min = " + lookupArrayService.findMin(array));
        System.out.println("Max = " + lookupArrayService.findMax(array));
        System.out.println("Index of max = " + lookupArrayService.indexOfMax(array));
        System.out.println("Index of min = " + lookupArrayService.indexOfMin(array));
        System.out.println("Index of 0 = " + lookupArrayService.indexOf(array, 0));
        System.out.print("Array = ");
        for (int x: array) {
            System.out.print(x + " ");
        }
    }
}
