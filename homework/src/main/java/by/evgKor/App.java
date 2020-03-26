package by.evgKor;

import by.evgKor.service.PowerCalculatorService;

public class App {
    public static void main(String[] args) {
        Thread thread=new Thread(new PowerCalculatorService());
        thread.start();
    }
}
