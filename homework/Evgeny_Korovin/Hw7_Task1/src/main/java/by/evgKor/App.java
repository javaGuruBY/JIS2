package by.evgKor;

import by.evgKor.service.LookUpArrayService;

public class App {
    public static void main(String[] args) {
        Thread thread=new Thread(new LookUpArrayService());
        thread.start();
    }
}
