package acya.ki.service;

public class Palindrome {
    public boolean isPalindrome(String text){
        text = text.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();

        for (int i = 0; i < text.length()/2; i++) {
            if(text.charAt(i) != text.charAt(text.length()-i-1)) {
                System.out.println("This text is not palindrome!");
                return false;
            }
        }
        System.out.println("This text is palindrome!");
        return true;
    }
}
