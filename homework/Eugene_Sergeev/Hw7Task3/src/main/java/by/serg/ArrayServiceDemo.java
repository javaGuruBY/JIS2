package by.serg;

import by.serg.service.ArrayService;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        int[] array = ArrayService.create(10);
        ArrayService.printArray(array);
        ArrayService.fillRandomly(array);
        ArrayService.printArray(array);
        ArrayService.sort(array);
        ArrayService.printArray(array);
        ArrayService.swap(array);
        ArrayService.printArray(array);
    }
}
