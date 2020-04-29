package by.alhr.Hw9_Task2_UniqueWordCounter.service;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter implements Runnable{
    public Map<String, Integer> wordCounterMap = new HashMap<>();

    void addWord(String word) {  // добавляет строку и считает количество раз, которое она была добавлена;
        int timesToAdd = countsNumberOfTimesToAdd(word);
        addWordToWordCounterMap (word, timesToAdd++);
    }

    public void addWordToWordCounterMap(String word, Integer timesToAdd) {
        wordCounterMap.put(word, timesToAdd);
    }

    public int countsNumberOfTimesToAdd(String word) {
        return this.wordCounterMap.get(word);
    }

    String getMostFrequentWord() {   //возвращает строку, которая была добавлена чаще всего;
        String wordResalt = "";
        int maxAddResalt=  0;
        for (Map.Entry<String, Integer> entry : this.wordCounterMap.entrySet()){
            if(entry.getValue()>maxAddResalt){
                wordResalt = entry.getKey();
            }
            System.out.println("Строка, которая была добавлена чаще всего: " + wordResalt);
        }return wordResalt;
    }

    void printWordsFrequency() { // печатает на экран содержимое коллекции, а также количество раз,
                                //  которое слово было добавлено;
         for (Map.Entry collectionSoderjimoe : wordCounterMap.entrySet()){
             System.out.println(collectionSoderjimoe.getKey() + ", " + collectionSoderjimoe.getValue());
         }
    }

    @Override
    public void run() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("Sasha");
        uniqueWordCounter.addWord("Sasha");
        uniqueWordCounter.addWord("Hello");
        uniqueWordCounter.addWord("Dima");
        uniqueWordCounter.addWord("Hello");
        uniqueWordCounter.addWord("Evgen");
        uniqueWordCounter.addWord("How old are you?");
        uniqueWordCounter.addWord("I am fine!!!");

        uniqueWordCounter.getMostFrequentWord();
        uniqueWordCounter.printWordsFrequency();
    }
}
