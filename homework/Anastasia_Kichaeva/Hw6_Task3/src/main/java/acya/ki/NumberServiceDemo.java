package acya.ki;

import acya.ki.bean.NumberService;

public class NumberServiceDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberService());
        thread.start();
    }
}
