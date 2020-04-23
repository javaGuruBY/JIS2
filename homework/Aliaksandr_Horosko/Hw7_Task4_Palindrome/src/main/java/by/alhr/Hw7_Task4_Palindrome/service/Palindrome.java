package by.alhr.Hw7_Task4_Palindrome.service;

public class Palindrome implements Runnable {
    boolean isPalindrome(String text) {
        text = text.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
        boolean result = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public void run() {
        Palindrome palindrome=new Palindrome();
        palindrome.isPalindrome("LEvel");
        palindrome.isPalindrome("sum summus mus");
        palindrome.isPalindrome("LEv,el");
        palindrome.isPalindrome("Не палиндромное выражение дает False");

    }
}
