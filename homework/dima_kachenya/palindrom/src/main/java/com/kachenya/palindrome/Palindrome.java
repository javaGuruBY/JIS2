package com.kachenya.palindrome;


import static java.lang.Character.toUpperCase;

public class Palindrome {
    public String name;
    public static boolean isPalindrome(String txt) {
        boolean isPalindrome = true;
        txt = txt.replace(",", "");
        txt = txt.replace(".", "");
        txt=txt.replace(" ","");
        for (int i = 0; i < txt.length() / 2; i++) {

            if (toUpperCase(txt.charAt(i)) != toUpperCase(txt.charAt(txt.length() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }
}
