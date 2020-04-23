package by.alhr.Hw7_Task4_Palindrome.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Palindrome palindromeTest = new Palindrome();
        String textTest = "level";
        String textTest2 = "LEv,el";
        String textTest3 = "Не палиндромное выражение дает False";

        assertEquals(true, palindromeTest.isPalindrome(textTest));
        assertEquals(true, palindromeTest.isPalindrome(textTest2));
        assertEquals(false, palindromeTest.isPalindrome(textTest3));
    }
}