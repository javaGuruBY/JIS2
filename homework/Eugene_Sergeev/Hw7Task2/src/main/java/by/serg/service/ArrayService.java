package by.serg.service;

import java.util.Arrays;

public class ArrayService {

    public static int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public static void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*101);
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int number: array) {
            sum += number;
        }
        return sum;
    }

    public static double avg(int[] array) {
        double sum = 0;
        for (double number: array) {
            sum += number;
        }
        return (sum/array.length);
    }
}
