package by.evgKor.service;

import java.util.Random;

public class ArrayService implements Runnable{

    @Override
    public void run() {
        ArrayService arrayService=new ArrayService();
        int[] array=arrayService.create(100);
        arrayService.fillRandomly(array);
        arrayService.printArray(array);
        arrayService.sum(array);
        arrayService.avg(array);
    }

    public int[] create(int size){
        int[] array=new int [size];
        return array;
    }
    public void fillRandomly(int[] array) {
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        printArray(array);
    }
    public void printArray(int[] array){
        for (int Array:array) {
            System.out.println("i = "+Array);
        }
    }
    public int sum(int[] array){
        int sum=array[0];
        for (int i=0;i<array.length;i++) {
            sum += array[i];
        }
        System.out.println("Sum of arrays number= "+sum);
        return sum;
    }

    public double avg(int [] array){
        double avg=0;
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
            avg=sum/array.length;
        }
        System.out.println("Arithmetic mean of all elements= "+avg);

        return avg;
    }
}
