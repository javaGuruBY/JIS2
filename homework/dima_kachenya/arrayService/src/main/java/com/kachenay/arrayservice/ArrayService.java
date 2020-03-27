package com.kachenay.arrayservice;

public class ArrayService {
    public static int[] create(int size){
        int[]array=new int[size];
        return array;
    }
    public static void fillRandomly(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        printArray(array);
    }
    public static void printArray(int[] array){
        for (int item:
             array) {
            System.out.println(item);
        }
    }
    public static int sum(int[] array){
        int sum=0;
        for (int item:
                array) {
            sum+=item;
        }
        return sum;
    }
    public static double avg(int[] array){
        return (double) sum(array)/array.length;
    }
}
