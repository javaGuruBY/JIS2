package acya.ki;

import acya.ki.service.Palindrome;

public class PalindromeDemo {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String text = "A. roza, ypala! na' la]py Azora";
        String text2 = "А! роза упала' на л/апу Азо;ра";
        String text3 = "la la la lalala kla";

        palindrome.isPalindrome(text);
        palindrome.isPalindrome(text2);
        palindrome.isPalindrome(text3);
    }

}
