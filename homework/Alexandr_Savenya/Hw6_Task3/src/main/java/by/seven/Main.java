package by.seven;

import by.seven.service.NumberService;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberService());
        thread.start();


    }
}
