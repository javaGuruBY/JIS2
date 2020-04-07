package acya.ki;

import acya.ki.service.ArrayService2;

public class ArrayServiceDemo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ArrayService2());
        thread.start();
    }
}
