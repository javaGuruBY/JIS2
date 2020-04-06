package com.kachenya;

import com.kachenya.vocabulary.UniqueWordVocabulary;

public class Main {
    public static void main(String[] args) throws Exception {
        UniqueWordVocabulary myVocabulary=new UniqueWordVocabulary();
        String str=null;
        myVocabulary.addWord(str);
        myVocabulary.addWord("Andrey");
        System.out.println("myVocabulary.getWordsCount() = " + myVocabulary.getWordsCount());
        myVocabulary.printVocabulary();
    }
}
