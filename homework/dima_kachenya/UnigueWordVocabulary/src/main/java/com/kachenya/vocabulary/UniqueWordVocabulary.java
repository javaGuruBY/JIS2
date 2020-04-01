package com.kachenya.vocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    private Set myVocabulary = new HashSet();

    public void addWord(String word) throws Exception {
        try {

            if (word.equals("")) {
                throw new Exception("String is empty");
            }
            myVocabulary.add(word);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getLocalizedMessage());
        }
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
