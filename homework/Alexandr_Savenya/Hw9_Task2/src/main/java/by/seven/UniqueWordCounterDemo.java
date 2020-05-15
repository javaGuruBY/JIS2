package by.seven;

import by.seven.service.UniqueWordCounter;

public class UniqueWordCounterDemo {
    public static void main(String[] args) {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("Pizdec");
        uniqueWordCounter.addWord("VachePisec");
        uniqueWordCounter.addWord("ZaikaBlat");
        uniqueWordCounter.addWord("Rabit");
        uniqueWordCounter.addWord("Rabit");
        System.out.println(uniqueWordCounter.getMostFrequentWord());
        uniqueWordCounter.printWordsFrequency();
    }


}
