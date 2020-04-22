package by.alhr.Hw7_Task3_SortSwap.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayServiceTest {

    @Test
    public void create() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest2 = arrayServiceTest.create(10);
        int[] expected = new int[10];
        int[] actual = arrayTest2;
        assertArrayEquals(expected, actual);
//        Assert.assertEquals(5, arrayServiceTest.create(5).length);
//        Assert.assertEquals(0, arrayServiceTest.create(0).length);
    }

    @Test
    public void fillRandomly() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest1 = new int[]{};
        int[] expected = new int[]{};
        arrayServiceTest.fillRandomly(arrayTest1);
        int[] actual = arrayTest1;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void printArray() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest1 = new int[]{};
        int[] expected = new int[]{};
        arrayServiceTest.printArray(arrayTest1);
        int[] actual = arrayTest1;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sum() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest = new int[]{12, 2, 8, 14, 4};
        int[] arrayTest1 = new int[]{};
        assertEquals(40, arrayServiceTest.sum(arrayTest));
        assertEquals(0, arrayServiceTest.sum(arrayTest1));
    }

    @Test
    public void avg() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest = new int[]{12, 2, 8, 14, 4};
        int[] arrayTest1 = new int[]{};
        assertEquals(8.0, arrayServiceTest.avg(arrayTest), 10 ^ 6);
        assertEquals(0, arrayServiceTest.avg(arrayTest1), 10 ^ 6);
    }

    @Test
    public void sort() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest = new int[]{12, 2, 8, 14, 4};
        int[] expected = {2, 4, 8, 12, 14};
        arrayServiceTest.sort(arrayTest);
        int[] actual = arrayTest;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void swap() {
        ArrayService arrayServiceTest = new ArrayService();
        int[] arrayTest = new int[]{12, 2, 8, 14, 4};
        int[] expected = {4, 14, 8, 2, 12};
        arrayServiceTest.swap(arrayTest);
        int[] actual = arrayTest;
        assertArrayEquals(expected, actual);
    }
}