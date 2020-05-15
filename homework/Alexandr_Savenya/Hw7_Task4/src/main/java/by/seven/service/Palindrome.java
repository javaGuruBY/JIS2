package by.seven.service;

public class Palindrome implements Runnable {

    public  boolean isPalindrome(String text) {
        text = text.replaceAll("[\\s]", "");
        for (int i = 0; i < text.length() / 2; ++i) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                System.out.println(" don't palindrome!");
                return false;
            }
        }
        System.out.println(" is palindrome!");
        return true;
    }

    public void run() {
        Palindrome palindrome = new Palindrome();
        String text1 = "level";
        String text2 = "live not on evil";
        System.out.print(text1 + "");
        palindrome.isPalindrome(text1);
        System.out.print(text2 + "");
        palindrome.isPalindrome(text2);
    }
}
