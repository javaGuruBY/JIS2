package by.seven;

import by.seven.service.Palindrome;

public class PalindromeDemo {
    public static void main(String[] args) {
      Thread thread = new Thread(new Palindrome());
      thread.start();
    }
}
