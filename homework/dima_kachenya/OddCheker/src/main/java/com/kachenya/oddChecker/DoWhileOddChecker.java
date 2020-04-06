package com.kachenya.oddChecker;

public class DoWhileOddChecker {
    public static void oddChecker() {
        System.out.println("Do While start");
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 50);
        System.out.println("Do while end");
    }
}
