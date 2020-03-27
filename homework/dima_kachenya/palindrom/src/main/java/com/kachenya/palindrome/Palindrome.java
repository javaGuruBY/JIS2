package com.kachenya.palindrome;

import static java.lang.Character.toUpperCase;

public class Palindrome {
    public static boolean isPalindrome(String txt) {
        boolean isPalindrome = true;
        for (int i = 0; i < txt.length() / 2; i++) {
            if (txt.charAt(i) == ',' || txt.charAt(i) == '.' ||
                    txt.charAt(txt.length() - 1 - i) == '.' ||
                    txt.charAt(txt.length() - 1 - i) == ',') {
                continue;
            } else if (toUpperCase(txt.charAt(i)) != toUpperCase(txt.charAt(txt.length() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }
}
