package by.alhr.hw2task3.bean;

import by.alhr.hw2task3.bean.MathOperations;

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.summ(15,25));
        System.out.println(mathOperations.difference(32,48));
        System.out.println(mathOperations.multiplication(58,10));
        System.out.println(mathOperations.division(33,45));
    }
}
