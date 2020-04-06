package com.kachenay;

import com.kachenay.arrayservice.ArrayService;

public class Main {
    public static void main(String[] args) {
        int[] array=ArrayService.create(100);
        ArrayService.fillRandomly(array);
        int sum=ArrayService.sum(array);
        System.out.println("sum = " + sum);
        double avg=ArrayService.avg(array);
        System.out.println("avg = " + avg);
    }
}
