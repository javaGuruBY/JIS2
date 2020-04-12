package by.alhr.hw2task4.service;

import by.alhr.hw2task4.bean.RandomGenerator;

public class RandomGeneratorService implements Runnable {

    private double randomNumber1;
    private double randomNumber2;
    private double randomNumber3;


    public void randomNumber1(RandomGenerator randomGenerator) {
       randomNumber1 = Math.random() * randomGenerator.getDiapazonA();
       System.out.println("a = " + randomNumber1);
    }

    public void randomNumber2(RandomGenerator randomGenerator) {
        randomNumber2 = Math.random() * randomGenerator.getDiapazonB();
        System.out.println("a = " + randomNumber2);
    }

    public void randomNumber3(RandomGenerator randomGenerator) {
        randomNumber3 = Math.random() * randomGenerator.getDiapazonC();
        System.out.println("a = " + randomNumber3);
    }

    public double amountRandom(RandomGenerator randomGenerator) {
        double sum = randomNumber1+randomNumber2+randomNumber3;
        System.out.println("amountRandom = " + sum);
        return sum;
    }


    @Override
    public void run() {
        RandomGenerator randomGenerator = new RandomGenerator(5, 13, 4);

        RandomGeneratorService randomGeneratorService = new RandomGeneratorService();
        randomGeneratorService.randomNumber1(randomGenerator);
        randomGeneratorService.randomNumber2(randomGenerator);
        randomGeneratorService.randomNumber3(randomGenerator);
        randomGeneratorService.amountRandom(randomGenerator);

    }
}