package by.seven;

import by.seven.bean.CreditCard;

public class CreditCardApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new CreditCard());
        thread.start();
    }
}
