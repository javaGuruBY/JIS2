package acya.ki;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstRandomNum = randomGenerator.nextInt();
        int secondRandomNum = randomGenerator.nextInt();
        int thirdRandomNum = randomGenerator.nextInt();

        System.out.println("The first random number is: " + firstRandomNum);
        System.out.println("The second random number is: " + secondRandomNum);
        System.out.println("The third random number is: " + thirdRandomNum);

        int sumRandomNum = firstRandomNum + secondRandomNum + thirdRandomNum;
        System.out.println("The sum of random numbers = " + sumRandomNum);

    }
}