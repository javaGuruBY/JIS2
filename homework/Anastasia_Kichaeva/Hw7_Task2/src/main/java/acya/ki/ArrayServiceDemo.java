package acya.ki;

import acya.ki.service.ArrayService;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new ArrayService());
        thread.start();
    }
}
