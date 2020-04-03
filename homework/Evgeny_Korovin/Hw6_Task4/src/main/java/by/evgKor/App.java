package by.evgKor;

import by.evgKor.service.AutoService;

public class App {
    public static void main(String[] args) {
        Thread thread=new Thread(new AutoService());
        thread.start();
    }
}
