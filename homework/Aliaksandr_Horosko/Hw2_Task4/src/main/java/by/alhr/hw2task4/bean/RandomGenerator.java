package by.alhr.hw2task4.bean;

public class RandomGenerator {

    double a = Math.random() * 5;
    double b = Math.random() * 8;
    double c = Math.random() * 12;

    public double amountRandom() {
        return a + b + c;
    }
}


