package com.kachenya.oddChecker;

public class ForOddChecker {
    public static void oddChecker() {
        System.out.println("For start");
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("For end");
    }
}
