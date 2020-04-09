package by.lukash.UniqueWordVocabulary.bean;


import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary implements Runnable {
    private Set<String> vocabulary = new HashSet<>();


    public void addWord(String word) {
        if (!word.isEmpty()) {
            vocabulary.add(word);
        }
    }


    public int getWordsCount() {
        System.out.println("Number of unique words = " + vocabulary.size());
        return vocabulary.size();
    }

    public void printVocabulary() {
        for (String word : vocabulary) {
            System.out.println(word);
        }
    }

    @Override
    public void run() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("Bob");
        uniqueWordVocabulary.addWord("Mark");
        uniqueWordVocabulary.addWord("Bob");
        uniqueWordVocabulary.addWord("Kate");
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.getWordsCount();
        uniqueWordVocabulary.printVocabulary();
    }
}
