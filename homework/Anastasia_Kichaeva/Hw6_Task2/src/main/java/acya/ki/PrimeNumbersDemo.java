package acya.ki;

import acya.ki.bean.PrimeNumbers;

public class PrimeNumbersDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new PrimeNumbers());
        thread.start();
    }
}
