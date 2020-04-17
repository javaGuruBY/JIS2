package acya.ki.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class LookupArrayServiceTest {

    LookupArrayService lookupArrayServiceTest = new LookupArrayService();
    int[] arrayTest = {34, 5, 42, 18, 99, 63, 0, 18};
    int[] arrayTest2 = {};

    @org.junit.jupiter.api.Test
    void isArrayEmpty() {
        assertEquals(false, lookupArrayServiceTest.isArrayEmpty(arrayTest));
        assertEquals(true, lookupArrayServiceTest.isArrayEmpty(arrayTest2));
    }

    @org.junit.jupiter.api.Test
    void findMax() {
        assertEquals(99, lookupArrayServiceTest.findMax(arrayTest));
        assertEquals(0, lookupArrayServiceTest.findMax(arrayTest2));
    }

    @org.junit.jupiter.api.Test
    void findMin() {
        assertEquals(0, lookupArrayServiceTest.findMin(arrayTest));
        assertEquals(0, lookupArrayServiceTest.findMin(arrayTest2));
    }

    @org.junit.jupiter.api.Test
    void indexOfMax() {
        assertEquals(4, lookupArrayServiceTest.indexOfMax(arrayTest));
        assertEquals(-1, lookupArrayServiceTest.indexOfMax(arrayTest2));
    }

    @Test
    void indexOfMin() {
        assertEquals(6, lookupArrayServiceTest.indexOfMin(arrayTest));
        assertEquals(-1, lookupArrayServiceTest.indexOfMin(arrayTest2));
    }

    @Test
    void indexOf() {
        assertEquals(3, lookupArrayServiceTest.indexOf(arrayTest, 18));
        assertEquals(-1, lookupArrayServiceTest.indexOf(arrayTest2, 18));
    }
}
