package by.alhr.Hw9_Task1_UniqueWordVocabulary.service;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueWordVocabularyTest {

    @Test
    public void addWord() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        Set<String> vocabularySetTest = new HashSet<String>();

        String word = "не пустое";
        vocabularySetTest.add(word);
        uniqueWordVocabulary.addWord(word);
        assertEquals(vocabularySetTest, uniqueWordVocabulary.vocabularySet);

        String word2 = "";
        vocabularySetTest.add(word2);
        uniqueWordVocabulary.addWord(word2);
        uniqueWordVocabulary.vocabularySet = vocabularySetTest;
        assertEquals(vocabularySetTest, uniqueWordVocabulary.vocabularySet);

        String word3 = "не пустое";
        vocabularySetTest.add(word3);
        uniqueWordVocabulary.addWord(word3);
        assertEquals(vocabularySetTest, uniqueWordVocabulary.vocabularySet);
    }

    @Test
    public void getWordsCount() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        Set<String> vocabularySetTest = new HashSet<String>();

        String word = "odno";
        vocabularySetTest.add(word);
        uniqueWordVocabulary.addWord(word);
        assertEquals(1, uniqueWordVocabulary.getWordsCount());

        String word2 = "";
        vocabularySetTest.add(word2);
        uniqueWordVocabulary.addWord(word2);
        assertEquals(1, uniqueWordVocabulary.getWordsCount());

        String word3 = "odno";
        vocabularySetTest.add(word3);
        uniqueWordVocabulary.addWord(word3);
        assertEquals(1, uniqueWordVocabulary.getWordsCount());

        String word4 = "dva";
        vocabularySetTest.add(word4);
        uniqueWordVocabulary.addWord(word4);
        assertEquals(2, uniqueWordVocabulary.getWordsCount());
    }

    @Test
    public void printVocabulary() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        Set<String> vocabularySetTest = new HashSet<String>();

        String word = "odno";
        vocabularySetTest.add(word);
        uniqueWordVocabulary.addWord(word);
        uniqueWordVocabulary.printVocabulary();
        assertEquals(vocabularySetTest, uniqueWordVocabulary.vocabularySet);
    }
}