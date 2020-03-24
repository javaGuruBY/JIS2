package by.evgKor;

import by.evgKor.service.NumberService;

public class Main {
    public static void main(String[] args) {
        System.out.println("sum of numb = "+NumberService.rangeSum(7,3));
        System.out.println("count of numb= "+ NumberService.rangeEvenCount(9,2));
    }
}
