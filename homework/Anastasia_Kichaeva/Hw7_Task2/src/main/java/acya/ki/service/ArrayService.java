package acya.ki.service;

import java.io.Serializable;
import java.util.Random;

public class ArrayService implements Serializable, Runnable {

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        printArray(array);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public int sum(int[] array) {
        int sumNumbersOfArray = 0;
        for (int i:array) {
            sumNumbersOfArray += i;
        }
        return sumNumbersOfArray;
    }

    public double avg(int[] array) {
        double avgNumbersOfArray;
        if(array.length == 0){
            avgNumbersOfArray = 0;
        } else {
            avgNumbersOfArray = (double) sum(array)/array.length;
        }
        return avgNumbersOfArray;
    }


    public void run() {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.create(15);
        arrayService.fillRandomly(array);
        arrayService.sum(array);
        System.out.println("Sum is: " + sum(array));
        arrayService.avg(array);
        System.out.println("Average is: " + avg(array));
    }
}
