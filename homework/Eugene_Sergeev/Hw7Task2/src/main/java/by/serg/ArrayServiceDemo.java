package by.serg;

import by.serg.service.ArrayService;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        int[] array = ArrayService.create(10);
        ArrayService.printArray(array);
        ArrayService.fillRandomly(array);
        ArrayService.printArray(array);
        int sum = ArrayService.sum(array);
        System.out.println("Сумма = " + sum);
        double avg = ArrayService.avg(array);
        System.out.println("Среднее арифметическое = " + avg);
    }
}
