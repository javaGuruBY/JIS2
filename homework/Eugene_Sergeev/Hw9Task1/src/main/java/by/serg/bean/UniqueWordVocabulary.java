package by.serg.bean;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    private Set<String> vocabulary = new HashSet<String>();

    public void addWord(String word) {
        if(word.replace(" ", "").equals("")) {
            System.out.println("Vocabulary can not contain empty strings");
            return;
        }
        vocabulary.add(word);
    }

    public int getWordsCount() {
        System.out.print("Number of unique words = ");
        return vocabulary.size();
    }
    public void printVocabulary() {
        for (String word: vocabulary) {
            System.out.println(word);
        }
    }
}
