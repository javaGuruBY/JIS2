package by.seven.service;

import java.util.*;



public class UniqueWordCounter {
    private Map<Integer, String> vocabulary = new HashMap();
    private static int worldCounterKey = 0;
    private Set<String> UniqueWorld = new HashSet<>();


    public void addWord(String word) {
        worldCounterKey++;
        vocabulary.put(worldCounterKey, word);
    }
     public String getMostFrequentWord() {
        String string = "";
        int counter = 0;
        for (int j = 1; j <= worldCounterKey; j++) {
            int countBuffer = 0;
            for (int i = 1; i < worldCounterKey; i++) {
                if (vocabulary.get(j).equals(vocabulary.get(i))) {
                    countBuffer++;
                }
                if (countBuffer > counter) {
                    counter = countBuffer;
                    string = vocabulary.get(j);
                }
            }
        }
         System.out.println("The most frequent word: ");
        return string;
     }

    public void printWordsFrequency() {
        for (int j = 1; j<= worldCounterKey; j++) {
            if(UniqueWorld.contains(vocabulary.get(j))) {
                continue;
            }
            UniqueWorld.add(vocabulary.get(j));
            int countBuffer = 0;

            for (int i = 1; i <= worldCounterKey; i++) {
                if (UniqueWorld.equals(vocabulary.get(i))) {
                    countBuffer++;
                }
                if (i == worldCounterKey) {
                    System.out.println(vocabulary.get(j) + "=" + countBuffer);
                }
            }
        }
    }

}
