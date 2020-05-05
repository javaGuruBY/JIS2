package by.alhr.Hw9_Task2_UniqueWordCounter.service;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    public Map<String, Integer> wordCounterMap = new HashMap<>();

    public void addWord(String word) {  // добавляет строку и считает количество раз, которое она была добавлена;
        int timesToAdd = countsNumberOfTimesToAdd(word);
        addWordToWordCounterMap(word, ++timesToAdd);
    }

    public void addWordToWordCounterMap(String word, Integer timesToAdd) {
        wordCounterMap.put(word, timesToAdd);
    }

    public int countsNumberOfTimesToAdd(String word) {
        Integer integer = this.wordCounterMap.get(word);
        if (integer != null) {
            return integer;
        }
        return 0;
    }

    public String getMostFrequentWord() {   //возвращает строку, которая была добавлена чаще всего;
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : wordCounterMap.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry + " - cтрока, которая была добавлена чаще всего!");
        return String.valueOf(maxEntry);
    }

    public void printWordsFrequency() { // печатает на экран содержимое коллекции, а также количество раз,
        //  которое слово было добавлено;
        for (Map.Entry collectionSoderjimoe : wordCounterMap.entrySet()) {
            System.out.print(collectionSoderjimoe.getKey() + " = " + collectionSoderjimoe.getValue() + "; ");
        }
    }
}
