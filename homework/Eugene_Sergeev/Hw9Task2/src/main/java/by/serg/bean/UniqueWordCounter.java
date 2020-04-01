package by.serg.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordCounter {
    private Map<Integer, String> map = new HashMap();
    private static int key = 0;
    private Set<String> uniqueList = new HashSet<>();


    public void addWord(String word) {
        key++;
        map.put(key, word);
    }

    public String getMostFrequentWord() {
        String string = "";
        int counter = 0;
        for (int j = 1; j <= key; j++) {
            int counterBuffer = 0;
            for (int i = 1; i <= key; i++) {
                if (map.get(j).equals(map.get(i))) {
                    counterBuffer++;
                }
                if (counterBuffer > counter) {
                    counter = counterBuffer;
                    string = map.get(j);
                }
            }
        }
        System.out.print("The most frequently word is = ");
        return string;
    }


    public void printWordsFrequency() {
        for (int j = 1; j <= key; j++) {

            if(uniqueList.contains(map.get(j))) {
                continue;
            }
            uniqueList.add(map.get(j));
            int counterBuffer = 0;

            for (int i = 1; i <= key; i++) {
                if (map.get(j).equals(map.get(i))) {
                    counterBuffer++;
                }
                if (i == key) {
                    System.out.println(map.get(j) + " = " + counterBuffer);
                }
            }
        }
    }
}
