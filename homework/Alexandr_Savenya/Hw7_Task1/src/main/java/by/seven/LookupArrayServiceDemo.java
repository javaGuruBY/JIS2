package by.seven;

import by.seven.service.LookupArrayService;

public class LookupArrayServiceDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new LookupArrayService());
        thread.start();
    }
}
