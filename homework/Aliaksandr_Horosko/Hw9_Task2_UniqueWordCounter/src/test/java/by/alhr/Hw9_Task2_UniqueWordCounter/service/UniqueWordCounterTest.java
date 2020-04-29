package by.alhr.Hw9_Task2_UniqueWordCounter.service;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {

    @Test
    void addWord() {
    }

    @Test
    void addWordToWordCounterMap() {
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
    void countsNumberOfTimesToAdd() {
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
    void getMostFrequentWord() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        Map<String, Integer> wordCounterMapTest = new HashMap<>();

        String word = "Garik";
        wordCounterMapTest.put(word, 5);
        String word2 = "Garik2";
        wordCounterMapTest.put(word2, 8);

        uniqueWordCounter.wordCounterMap = wordCounterMapTest;
        String expected = word2;
        String actual = uniqueWordCounter.getMostFrequentWord();
        assertEquals(expected, actual);
    }
}