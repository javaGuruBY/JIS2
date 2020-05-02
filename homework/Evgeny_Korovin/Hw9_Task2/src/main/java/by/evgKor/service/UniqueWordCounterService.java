package by.evgKor.service;

import java.util.*;


public class UniqueWordCounterService {
    Map<String, Integer> wordCounterMap = new HashMap<>();
    ArrayList<String> wordList = new ArrayList<>();

    public void addWord(String word) {
        wordList.add(word);
    }

    public void addWordToWordCounterMap() {
        for (int i = 0; i < wordList.size(); i++) {
            String string = wordList.get(i);
            if (!wordCounterMap.containsKey(string)) {
                wordCounterMap.put(string, 1);
            } else {
                wordCounterMap.put(string, wordCounterMap.get(string) + 1);
            }
        }
    }

    public void getMostFrequentWord() {
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : wordCounterMap.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);
    }

    public void printInformation() {
        for (Map.Entry<String, Integer> entry : wordCounterMap.entrySet()) {
            System.out.println("Слово = " + entry.getKey() + ", Повторяется = " + entry.getValue());
        }
    }
}



