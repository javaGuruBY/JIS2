package by.serg;

import by.serg.bean.CreditCard;

public class CreditCardDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new CreditCard());
        thread.start();
    }
}
