package by.evgKor;

import by.evgKor.service.CopyService;

public class App {
    public static void main(String[] args) {
        Thread thread=new Thread(new CopyService());
        thread.start();
    }
}
