package Hw9_Task2_UniqueWordCounter.service;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueWordCounterServiceTest {

    @org.junit.jupiter.api.Test
    public void addWordTest() {
        UniqueWordCounterService uniqueWordCounterService = new UniqueWordCounterService();
        ArrayList<String> wordListTest = new ArrayList<String>();

        String word = "111111";
        wordListTest.add(word);

        uniqueWordCounterService.addWord(word);

        assertEquals(wordListTest, uniqueWordCounterService.wordList);
    }

    @org.junit.jupiter.api.Test
    void addWordToWordCounterMapTest() {
//        UniqueWordCounterService uniqueWordCounterService = new UniqueWordCounterService();
//        Map<String, Integer> wordHolderMapTest = new HashMap<String, Integer>();
//        ArrayList<String> wordListTest = new ArrayList<String>();
//
//        String word = "11111";
//        wordHolderMapTest.put(word, 1);
//
//        String word2 = "11111";
//        wordHolderMapTest.put(word2, 2);
//
//        uniqueWordCounterService.wordHolderMap = wordHolderMapTest;
//
//        String expected = word2;
//        String actual = uniqueWordCounterService.addWordToWordCounterMap();
//        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void getMostFrequentWordTest() {
    }

    @org.junit.jupiter.api.Test
    void printInformationTest() {
    }
}