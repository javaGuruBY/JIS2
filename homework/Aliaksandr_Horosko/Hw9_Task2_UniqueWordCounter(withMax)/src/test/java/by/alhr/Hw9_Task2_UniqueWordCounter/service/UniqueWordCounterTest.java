package by.alhr.Hw9_Task2_UniqueWordCounter.service;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueWordCounterTest {

    @Test
    public void addWord() {
    }

    @Test
    public void addWordToWordCounterMap() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        Map<String, Integer> wordCounterMapTest = new HashMap<>();

        String word = "Garik";
        wordCounterMapTest.put(word, 1);

        uniqueWordCounter.addWordToWordCounterMap(word, 1);
        assertEquals(wordCounterMapTest, uniqueWordCounter.wordCounterMap);

        String word2 = "Garik2";
        wordCounterMapTest.put(word2, 2);

        uniqueWordCounter.addWordToWordCounterMap(word2, 2);
        assertEquals(wordCounterMapTest, uniqueWordCounter.wordCounterMap);
    }

    @Test
    public void countsNumberOfTimesToAdd() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        Map<String, Integer> wordCounterMapTest = new HashMap<>();

        String word = "Garik";
        wordCounterMapTest.put(word, 5);

        uniqueWordCounter.wordCounterMap = wordCounterMapTest;
        int expected = 5;
        int actual = uniqueWordCounter.countsNumberOfTimesToAdd(word);
        assertEquals(expected, actual);
    }

    @Test
    public void countsNumberOfTimesToAdd_ShouldReturn0_ifNotInTheList() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        Map<String, Integer> wordCounterMapTest = new HashMap<>();

        String notInCollectionWord = "Max";
        uniqueWordCounter.wordCounterMap = wordCounterMapTest;
        int expected = 0;
        int actual = uniqueWordCounter.countsNumberOfTimesToAdd(notInCollectionWord);
        assertEquals(expected, actual);
    }

    @Test
    public void getMostFrequentWord() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        Map<String, Integer> wordCounterMapTest = new HashMap<>();

        String word = "Garik";
        String word2 = "Garik";
        String word3 = "Max";
        String word4 = "Garik";

        wordCounterMapTest.put(word, 1);
        wordCounterMapTest.put(word2, 2);
        wordCounterMapTest.put(word3, 1);
        wordCounterMapTest.put(word4, 3);

        uniqueWordCounter.wordCounterMap = wordCounterMapTest;
        String expected = "Garik=3";
        String actual = uniqueWordCounter.getMostFrequentWord();
        assertEquals(expected, actual);
    }
}