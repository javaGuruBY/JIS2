package Hw9_Task2_UniqueWordCounter.service;

import java.util.*;

public class UniqueWordCounterService {
    public Map<String, Integer> wordHolderMap = new HashMap<String, Integer>();
    public ArrayList<String> wordList = new ArrayList<String>();

    public void addWord(String word) {
        wordList.add(word);
    }

    public void addWordToWordCounterMap() {
        for (int i = 0; i < wordList.size(); i++) {
            String string = wordList.get(i);
            if (!wordHolderMap.containsKey(string)) {
                wordHolderMap.put(string, 1);
            } else {
                wordHolderMap.put(string, wordHolderMap.get(string) + 1);
            }
        }
        System.out.println(wordHolderMap);
    }

    public void getMostFrequentWord() {
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : wordHolderMap.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry + " - строка, которая была добавлена чаще всего!");
        System.out.println();
    }

    public void printInformation() {
        for (Map.Entry<String, Integer> entry : wordHolderMap.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + "; ");
        }
    }
}