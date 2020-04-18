package acya.ki.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Palindrome palindromeTest = new Palindrome();
        String textTest = "А роза упала на лапу Азора";
        String textTest2 = "L$%[evE/.l";
        String textTest3 = "А роза НЕ упала на лапу Азора";

        assertEquals(true, palindromeTest.isPalindrome(textTest));
        assertEquals(true, palindromeTest.isPalindrome(textTest2));
        assertEquals(false, palindromeTest.isPalindrome(textTest3));
    }
}