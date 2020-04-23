package by.alhr.Hw7_Task5_CopyRange.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CopyTest {

    @Test
    public void copyInRange() {
        Copy copyTest = new Copy();
        int[] arrayTest = {12, 33, 5, 8, 22, 10, 18, 100, 10};
        int[] actual = copyTest.copyInRange(arrayTest, 18, 33);
        int[] expected = {33, 22, 18};
        assertArrayEquals(expected, actual);
    }
}