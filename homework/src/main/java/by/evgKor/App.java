package by.evgKor;

import by.evgKor.service.ArrayService;

public class App {
    public static void main(String[] args) {
        Thread thread=new Thread(new ArrayService());
        thread.start();
    }
}
