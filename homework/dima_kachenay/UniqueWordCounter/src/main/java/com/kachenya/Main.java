package com.kachenya;

import com.kachenya.counter.UniqueWordCounter;

public class Main {
    public static void main(String[] args) {
        UniqueWordCounter myCounter=new UniqueWordCounter();
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("q");
        myCounter.addWord("q");
        myCounter.addWord("q");
        myCounter.addWord("q");
        myCounter.addWord("Lq");
        myCounter.addWord("Lq");
        myCounter.addWord("Lq");
        myCounter.addWord("Lq");
        myCounter.addWord("Lq1");
        myCounter.addWord("Lq1");
        myCounter.addWord("Lq1");
        myCounter.addWord("Lq1");
        myCounter.addWord("qwer");
        myCounter.addWord("qwer");
        myCounter.addWord("qwer");
        myCounter.addWord("qwer");
        myCounter.addWord("qwer");
        myCounter.addWord("dima");
        myCounter.addWord("dima");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");
        myCounter.addWord("Hello");

        System.out.println(myCounter.getMostFrequentWord());
        myCounter.printWordsFrequency();
    }
}
