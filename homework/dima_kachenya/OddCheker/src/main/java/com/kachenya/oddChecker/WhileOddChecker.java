package com.kachenya.oddChecker;

public class WhileOddChecker {
    public static void oddChecker() {
        int i = 0;
        System.out.println("While start");
        while (i < 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("While end");
    }
}
