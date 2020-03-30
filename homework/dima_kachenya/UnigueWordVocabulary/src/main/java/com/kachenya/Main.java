package com.kachenya;

import com.kachenya.vocabulary.UniqueWordVocabulary;

public class Main {
    public static void main(String[] args) {
        UniqueWordVocabulary myVocabulary=new UniqueWordVocabulary();
        myVocabulary.addWord("Dima");
        myVocabulary.addWord("Andrey");
        System.out.println("myVocabulary.getWordsCount() = " + myVocabulary.getWordsCount());
        myVocabulary.printVocabulary();
    }
}
