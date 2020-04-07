package by.serg;

import by.serg.service.Palindrome;

public class PalindromeDemo {
    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        System.out.println(Palindrome.isPalindrome(text));

    }
}
