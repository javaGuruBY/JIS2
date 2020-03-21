package by.serg;

import by.serg.service.CounterService;

public class CounterDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new CounterService());
        thread.start();
    }
}
