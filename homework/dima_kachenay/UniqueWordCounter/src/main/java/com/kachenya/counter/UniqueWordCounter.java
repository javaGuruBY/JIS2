package com.kachenya.counter;

import java.util.*;

public class UniqueWordCounter {
    private HashMap<Integer, String> counter;
    private static Integer counterOfIteration = 0;
    private Set<String> myCaseForUniqueWord;
    List<SeveState> arraOfCollWord = new LinkedList<SeveState>();

    public UniqueWordCounter() {
        counter = new HashMap<Integer, String>();
        myCaseForUniqueWord = new HashSet<String>();
    }

    public void addWord(String word) {
        counter.put(counterOfIteration, word);
        counterOfIteration++;
        myCaseForUniqueWord.add(word);

    }

    public int getMostFrequentWord() {

        int counterOfEnter = 0;
        int i = 0;
        for (String itemForSet :
                myCaseForUniqueWord) {

            for (String item :
                    counter.values()) {
                if (itemForSet.equals(item)) {
                    counterOfEnter++;
                }
            }
            arraOfCollWord.add(new SeveState(counterOfEnter,itemForSet));
            i++;
            counterOfEnter = 0;
        }
        int maxElement = arraOfCollWord.get(0).countOfEnter;
        for (int j = 0; j < myCaseForUniqueWord.size(); j++) {
            if (maxElement < arraOfCollWord.get(j).countOfEnter) {
                maxElement = arraOfCollWord.get(j).countOfEnter;
            }
        }
        return maxElement;

    }

    public void printWordsFrequency() {
        for (String item:
             counter.values()){
            for (SeveState collOfEnter:
                 arraOfCollWord) {
                if(item.equals(collOfEnter.word)){
                    System.out.println("Колличество вхождений слова "+item+" равно: "+collOfEnter.countOfEnter);
                    break;
                }
            }
        }
    }
}
