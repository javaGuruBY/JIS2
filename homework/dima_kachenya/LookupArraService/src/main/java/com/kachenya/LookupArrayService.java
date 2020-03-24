package com.kachenya;

import java.util.ArrayList;
import java.util.List;

public class LookupArrayService {
    public static int findMax(int[] array) {
        try {
            int maxNumber = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxNumber) {
                    maxNumber = array[i];
                }
            }
            return maxNumber;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getLocalizedMessage());

            return 0;
        }
    }

    public static int findMin(int[] arrey) {
        try {
            int minNumber = arrey[0];
            for (int i = 0; i < arrey.length; i++) {
                if (arrey[i] < minNumber) {
                    minNumber = arrey[i];
                }
            }
            return minNumber;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getLocalizedMessage());

            return 0;
        }
    }

    public static List<Integer> indexOfMax(int[] arrey) {
        try {
            int maxNumber = findMax(arrey);
            List<Integer> myIndex = new ArrayList<Integer>();
            for (int i = 0; i < arrey.length; i++) {
                if (arrey[i] == maxNumber) {
                    myIndex.add(i);
                }
            }

            return myIndex;

        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getLocalizedMessage());

            return new ArrayList<Integer>(-1);
        }

    }

    public static List<Integer> indexOfMin(int[] arrey) {
        try {
            int minNumber = findMin(arrey);
            List<Integer> myIndex = new ArrayList<Integer>();
            for (int i = 0; i < arrey.length; i++) {
                if (arrey[i] == minNumber) {
                    myIndex.add(i);
                }
            }

            return myIndex;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getLocalizedMessage());

            return new ArrayList<Integer>(-1);
        }
    }

    public static int indexOf(int[] arrey, int value) {
        try {
            int index = -1;
            for (int i = 0; i < arrey.length; i++) {
                if (arrey[i] == value) {
                    index = i;
                    break;
                }
            }

            return index;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getLocalizedMessage());

            return -1;
        }

    }
}
