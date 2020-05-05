package by.alhr.Hw9_Task2_UniqueWordCounter;

import by.alhr.Hw9_Task2_UniqueWordCounter.service.UniqueWordCounter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task2UniqueWordCounterDemo {

    public static void main(String[] args) {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("Sasha");
        uniqueWordCounter.addWord("Sasha");
        uniqueWordCounter.addWord("Hello");
        uniqueWordCounter.addWord("Dima");
        uniqueWordCounter.addWord("Hello");
        uniqueWordCounter.addWord("Evgen");
        uniqueWordCounter.addWord("How old are you?");
        uniqueWordCounter.addWord("Hello");

        uniqueWordCounter.addWord("I am fine!!!");

        uniqueWordCounter.getMostFrequentWord();
        System.out.println();
        uniqueWordCounter.printWordsFrequency();
    }
//		SpringApplication.run(Hw9Task2UniqueWordCounterDemo.class, args);
}
