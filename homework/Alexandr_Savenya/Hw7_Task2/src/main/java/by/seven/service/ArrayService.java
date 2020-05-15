package by.seven.service;

import java.io.Serializable;

public class ArrayService implements Serializable, Runnable{

    public int[] create(int size) {
       int[] array  = new int[size];
       return array;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            int b = 100;
            array[i] = a + (int) (Math.random() * b);
        }
    }

    public void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int sum(int[] array) {
        int sumNum = 0;
        for (int i = 0; i < array.length; i++) {
            sumNum = sumNum + array[i];
        }
        System.out.println("Sum:\n" + sumNum);
        return sumNum;
    }

    public double avg(int[] array) {
        double avgNum = 0;
        if (array.length == 0) {
            avgNum = 0;
        } else {
            avgNum = (double) sum(array)/array.length;
        }
        System.out.println("Avg: \n" + avgNum);
        return avgNum;
    }

    public void run() {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.create(27);
        arrayService.fillRandomly(array);
        arrayService.printArray(array);
        arrayService.sum(array);
        arrayService.avg(array);

    }
}
