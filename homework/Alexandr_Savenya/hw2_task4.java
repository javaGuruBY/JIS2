package by.seven;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt();
        int secondNumber = random.nextInt();
        int thirdNumber = random.nextInt();
        System.out.println("First generaited number: " + firstNumber);
        System.out.println("Second generaited number: " + secondNumber);
        System.out.println("Third generaited number: " + thirdNumber);
        long sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum: " + sum);
    }
}
