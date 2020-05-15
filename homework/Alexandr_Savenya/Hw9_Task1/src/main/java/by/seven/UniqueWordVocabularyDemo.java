package by.seven;

import by.seven.service.UniqueWordVocabulary;

import java.util.HashSet;

public class UniqueWordVocabularyDemo {
    public static void main(String[] args) throws Exception {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        String string1 = "dollar";
        String string2 = "Ruble";
        String string3 = "dollar";
        String string4 = " ";
        uniqueWordVocabulary.addWord(string1);
        uniqueWordVocabulary.addWord(string2);
        uniqueWordVocabulary.addWord(string3);
        uniqueWordVocabulary.addWord(string4);
        uniqueWordVocabulary.printVocabulary();
        uniqueWordVocabulary.getWordsCount();
    }
}
