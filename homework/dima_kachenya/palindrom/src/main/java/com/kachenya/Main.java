package com.kachenya;

import com.kachenya.palindrome.Palindrome;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myList=new LinkedList<String>();
        myList.add("so,,w");
        System.out.println(Palindrome.isPalindrome("АРоза упала на лапу Азора"));

    }
}
