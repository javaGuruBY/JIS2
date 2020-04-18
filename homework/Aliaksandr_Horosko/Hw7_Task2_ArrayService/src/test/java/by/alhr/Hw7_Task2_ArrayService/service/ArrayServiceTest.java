package by.alhr.Hw7_Task2_ArrayService.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class ArrayServiceTest {
    ArrayService arrayServiceTest = new ArrayService();

    int[] arrayTest = new int[]{12, 2, 8, 14, 4};
    int[] arrayTest1 = new int[]{};

    @Test
    void create() {
        int[] arrayTest2 = arrayServiceTest.create(10);
        int[] expected = new int[10];
        int[] actual = arrayTest2;
        assertArrayEquals(expected, actual);
//        Assert.assertEquals(5, arrayServiceTest.create(5).length);
//        Assert.assertEquals(0, arrayServiceTest.create(0).length);
    }

    @Test
    void fillRandomly() {
        int[] expected = new int[]{};
        arrayServiceTest.fillRandomly(arrayTest1);
        int[] actual = arrayTest1;
        assertArrayEquals(expected, actual);
    }

    @Test
    void printArray() {
        int[] expected = new int[]{};
        arrayServiceTest.printArray(arrayTest1);
        int[] actual = arrayTest1;
        assertArrayEquals(expected, actual);
    }

    @Test
    void sum() {
        assertEquals(40, arrayServiceTest.sum(arrayTest));
        assertEquals(0, arrayServiceTest.sum(arrayTest1));
    }

    @Test
    void avg() {
        assertEquals(8.0, arrayServiceTest.avg(arrayTest), 10 ^ 6);
        assertEquals(0, arrayServiceTest.avg(arrayTest1), 10 ^ 6);
    }
}