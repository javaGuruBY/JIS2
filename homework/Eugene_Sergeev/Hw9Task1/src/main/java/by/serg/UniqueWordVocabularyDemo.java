package by.serg;

import by.serg.bean.UniqueWordVocabulary;

public class UniqueWordVocabularyDemo {
    public static void main(String[] args) {
        UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();
        vocabulary.addWord("123");
        vocabulary.addWord("123");
        vocabulary.addWord("  ");
        vocabulary.addWord("321");
        System.out.println(vocabulary.getWordsCount());
        vocabulary.printVocabulary();
    }
}
