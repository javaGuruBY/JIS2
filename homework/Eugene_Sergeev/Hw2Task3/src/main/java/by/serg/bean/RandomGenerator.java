package by.serg.bean;

import java.util.Random;

public class RandomGenerator {
    private double number1;
    private double number2;
    private double number3;

    public void generateFirstNumberViaMath(double min, double max) {
        max -= min;
        this.number1 = Math.random()*max+min;
        System.out.println("number1 = " + number1);
    }

    public void generateSecondNumberViaMath(double min, double max) {
        max -= min;
        this.number2 = Math.random()*max+min;
        System.out.println("number2 = " + number2);
    }

    public void generateThirdNumberViaMath(double min, double max) {
        max -= min;
        this.number3 = Math.random()*max+min;
        System.out.println("number3 = " + number3);
    }

    public void generateThreeNumbersViaMath(double min, double max) {
        max -= min;
        this.number1 = Math.random()*max+min;
        this.number2 = Math.random()*max+min;
        this.number3 = Math.random()*max+min;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
    }

    public void generateFirstNumberViaRandom(double min, double max) {
        Random random = new Random();
        max -= min;
        this.number1 = random.nextDouble()*max+min;
        System.out.println("number1 = " + number1);
    }

    public void generateSecondNumberViaRandom(double min, double max) {
        Random random = new Random();
        max -= min;
        this.number2 = random.nextDouble()*max+min;
        System.out.println("number2 = " + number2);
    }

    public void generateThirdNumberViaRandom(double min, double max) {
        Random random = new Random();
        max -= min;
        this.number1 = random.nextDouble()*max+min;
        System.out.println("number3 = " + number3);
    }

    public void generateThreeNumbersViaRandom(double min, double max) {
        Random random = new Random();
        max -= min;
        this.number1 = random.nextDouble()*max+min;
        this.number2 = random.nextDouble()*max+min;
        this.number3 = random.nextDouble()*max+min;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
    }

    public void summThreeNumbers() {
        double result = number1 + number2 + number3;
        System.out.println("result = " + result);
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getNumber3() {
        return number3;
    }
}
