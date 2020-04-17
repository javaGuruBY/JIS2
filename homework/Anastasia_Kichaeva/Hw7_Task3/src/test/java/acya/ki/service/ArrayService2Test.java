package acya.ki.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayService2Test {
    ArrayService2 arrayService2Test = new ArrayService2();
    int[] arrayTest = {2,4,6,8,3,1,5};
    int[] arrayTest2 = {5,4,3,2,1};

    @Test
    void sort() {
        int[] expected = {1, 2, 3, 4, 5, 6, 8};
        arrayService2Test.sort(arrayTest);
        int[] actual = arrayTest;

        assertArrayEquals(expected, actual);
    }

    @Test
    void swap() {
        int[] expected = {1, 2, 3, 4, 5};
        arrayService2Test.swap(arrayTest2);
        int[] actual = arrayTest2;

        assertArrayEquals(expected, actual);

    }
}