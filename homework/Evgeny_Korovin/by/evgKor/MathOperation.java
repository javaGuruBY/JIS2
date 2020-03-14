package by.evgKor;

import by.evgKor.bean.MathOperationDemo;

public class MathOperation {
    public static void main(String[] args) {
        MathOperationDemo result = new MathOperationDemo();
        System.out.println("result of amount= "+result.amount(50,14));
        System.out.println("result of division= "+result.difference(777,256));
        System.out.println("result of multiplication= "+result.multiplication(70,40));
        System.out.println("result of division= "+result.division(2020,145));

    }
}
