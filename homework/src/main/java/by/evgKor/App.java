package by.evgKor;

import by.evgKor.service.PalindromeService;

public class App {
    public static void main(String[] args) {
        Thread thread=new Thread(new PalindromeService());
        thread.start();
    }
}
