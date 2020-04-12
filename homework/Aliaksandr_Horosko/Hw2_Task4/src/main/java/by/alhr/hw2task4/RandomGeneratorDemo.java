package by.alhr.hw2task4;

import by.alhr.hw2task4.bean.RandomGenerator;
import by.alhr.hw2task4.service.RandomGeneratorService;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new RandomGeneratorService());
        thread.start();
    }

}
