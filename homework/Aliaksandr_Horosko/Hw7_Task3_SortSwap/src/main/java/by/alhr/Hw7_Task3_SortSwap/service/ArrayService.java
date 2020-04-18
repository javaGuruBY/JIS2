package by.alhr.Hw7_Task3_SortSwap.service;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayService implements Serializable, Runnable {
    int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        printArray(array);
    }

    void printArray(int[] array) {
        for (int myNumber : array) {
        }
        System.out.println(Arrays.toString(array));
    }

    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
        return sum;
    }

    double avg(int[] array) {
        int number = 0;
        if (array.length == 0) {
        } else {
            double averageNumber = 0;
            if (array.length > 0) {
                double sum = 0;
                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                averageNumber = sum / array.length;
                System.out.println("Average = " + averageNumber);
                return averageNumber;
            }
        }
        System.out.println("Average = " + number);
        return number;
    }

    public void sort(int[] array) {
        System.out.print("Sort < : ");
        for (int i = array.length - 1; i > 0; i--) {       //  сортировка массива пузырьком (по возрастанию)
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        //        Arrays.sort(array)                          //еще один вариант
        //        for (int i = 0; i < array.length; i++) {
        //        }
        System.out.println(Arrays.toString(array));
    }

    public void swap(int[] array) {
        System.out.print("Sort < : ");
        int tmp;
        int j = array.length;                         // метод, который переставляет ->
        for (int i = 0; i < j  / 2; i++) {            // -> все элементы массива в обратном порядке
            tmp = array[j  - i - 1];
            array[j - i - 1] = array[i];
            array[i] = tmp;
        }
//        int last = array.length;
//        for (boolean sorted = last == 0; !sorted; --last) {     //  сортировка массива пузырьком (по убыванию)
//            sorted = true;
//            for (int i = 1; i < last; i++) {
//                if (array[i - 1] < array[i]) {
//                    sorted = false;
//
//                    int tmp = array[i - 1];
//                    array[i - 1] = array[i];
//                    array[i] = tmp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void run() {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.create(5);
        arrayService.printArray(array);
        arrayService.fillRandomly(array);
        arrayService.sum(array);
        arrayService.avg(array);
        arrayService.sort(array);
        arrayService.swap(array);

    }
}
