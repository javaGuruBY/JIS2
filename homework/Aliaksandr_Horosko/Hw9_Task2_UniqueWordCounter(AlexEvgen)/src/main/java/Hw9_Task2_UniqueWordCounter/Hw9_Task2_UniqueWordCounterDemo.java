package Hw9_Task2_UniqueWordCounter;

import Hw9_Task2_UniqueWordCounter.service.UniqueWordCounterService;

public class Hw9_Task2_UniqueWordCounterDemo {
    public static void main(String[] args) {
        UniqueWordCounterService uniqueWordCounterService = new UniqueWordCounterService();
        uniqueWordCounterService.addWord("apple");
        uniqueWordCounterService.addWord("mango");
        uniqueWordCounterService.addWord("orange");
        uniqueWordCounterService.addWord("apple");
        uniqueWordCounterService.addWord("apple");
        uniqueWordCounterService.addWord("salo");

        uniqueWordCounterService.addWordToWordCounterMap();
        uniqueWordCounterService.getMostFrequentWord();
        uniqueWordCounterService.printInformation();
    }
}
