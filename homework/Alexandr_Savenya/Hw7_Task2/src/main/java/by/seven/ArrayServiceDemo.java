package by.seven;

import by.seven.service.ArrayService;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        Thread thread  = new Thread(new ArrayService());
        thread.start();
    }
}
