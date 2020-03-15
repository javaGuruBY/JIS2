package by.alhr.hw2task4.bean;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println("a = " + randomGenerator.a);
        System.out.println("b = " + randomGenerator.b);
        System.out.println("c = " + randomGenerator.c);
        System.out.println("amountRandom = " + randomGenerator.amountRandom());
    }
}
