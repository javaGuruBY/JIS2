package com.kachenya.vocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    private Set myVocabulary = new HashSet();

    public void addWord(String word) {
        myVocabulary.add(word);
    }
    public int getWordsCount(){
        return myVocabulary.size();
    }
    public void printVocabulary(){
        for (Object item:
             myVocabulary) {
            System.out.println(item);
        }
    }

}
