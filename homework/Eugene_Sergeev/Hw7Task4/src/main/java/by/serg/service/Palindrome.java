package by.serg.service;

import static java.lang.Character.toUpperCase;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        text = text.replace(",","");
        text = text.replace(" ", "");
        text = text.replace(".", "");
        System.out.println(text);

        for (int i = 0; i < text.length()/2; i++) {
            if(text.charAt(i) != text.charAt(text.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
