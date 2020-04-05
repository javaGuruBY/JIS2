package by.evgKor.bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary implements Runnable {
    private Set<String> vocabularyEx = new HashSet<>();

    public void addWord(String word) {
        if (!word.isEmpty()) {
            vocabularyEx.add(word);
        }
    }

    public int getWordsCount() {
        System.out.println("Number of unique words = " + vocabularyEx.size());
        return vocabularyEx.size();
    }

    public void printVocabulary() {
        for (String words : vocabularyEx) {
            System.out.println(words);
        }
    }

    @Override
    public void run() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("Sasha");
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.addWord("Andrei");
        uniqueWordVocabulary.addWord("Jenya");
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.getWordsCount();
        uniqueWordVocabulary.printVocabulary();
    }
}
