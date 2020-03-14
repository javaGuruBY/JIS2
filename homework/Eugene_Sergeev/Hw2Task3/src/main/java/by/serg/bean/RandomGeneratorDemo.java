package by.serg.bean;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.generateThreeNumbersViaMath(-50, 80);
        randomGenerator.summThreeNumbers();
        randomGenerator.generateThreeNumbersViaRandom(-100,100);
        randomGenerator.summThreeNumbers();
    }
}
