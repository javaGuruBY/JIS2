package by.seven.service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set vocabulary = new HashSet();

    public void addWord(String word) throws Exception {
        if (word.equals(" ")) {
            System.out.println("String is empty");
        }else {
            vocabulary.add(word);
        }
    }


    public int getWordsCount() {
        return vocabulary.size();
   }

    public void printVocabulary() {
        for (Object i : vocabulary) {
            System.out.println(i);
        }
    }
}
