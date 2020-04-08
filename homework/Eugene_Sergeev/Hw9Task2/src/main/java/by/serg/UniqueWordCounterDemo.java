package by.serg;

import by.serg.bean.UniqueWordCounter;

public class UniqueWordCounterDemo {
    public static void main(String[] args) {
        UniqueWordCounter counter = new UniqueWordCounter();
        counter.addWord("Hello");
        counter.addWord("Dima");
        counter.addWord("Hello");
        counter.addWord("Dima");
        counter.addWord("Kak dela?");
        counter.addWord("...");
        counter.addWord("Dima");
        counter.addWord("Ya vzyal tvou ideu dobavit HashSet))");
        System.out.println(counter.getMostFrequentWord());
        counter.printWordsFrequency();
    }
}
