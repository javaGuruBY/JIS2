package by.evgKor;


import by.evgKor.service.UniqueWordCounterService;


public class App {
    public static void main(String[] args) {
        UniqueWordCounterService uniqueWordCounterService = new UniqueWordCounterService();
        uniqueWordCounterService.addWord("apple");
        uniqueWordCounterService.addWord("orange");
        uniqueWordCounterService.addWord("banana");
        uniqueWordCounterService.addWord("apple");
        uniqueWordCounterService.addWord("apple");
        uniqueWordCounterService.addWordToWordCounterMap();
        uniqueWordCounterService.getMostFrequentWord();
        uniqueWordCounterService.printInformation();
    }
}