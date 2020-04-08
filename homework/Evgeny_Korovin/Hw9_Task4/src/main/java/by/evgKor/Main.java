package by.evgKor;

import by.evgKor.service.ShopService;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(new ShopService());
        thread.start();
    }
}
