package by.evgKor.service;

public class PalindromeService implements Runnable {
    @Override
    public void run() {
        PalindromeService palindromeService=new PalindromeService();
        palindromeService.isPalindrome("LEvel");
    }

    boolean isPalindrome(String text) {
        text = text.replaceAll("[\\s]", "").toLowerCase();
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
}
