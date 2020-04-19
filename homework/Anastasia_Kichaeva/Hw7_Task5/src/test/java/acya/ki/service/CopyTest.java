package acya.ki.service;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CopyTest {

    @Test
    public void copyInRange() {
        Copy copyTest = new Copy();
        int[] inTest = {20, 1, 4, 15, 68, 13, 75, 120, 10, 16, 33, 24};
        int[] actual = copyTest.copyInRange(inTest, 10, 20);
        int[] expected = {20, 15, 13, 10, 16};
        assertArrayEquals(expected, actual);
    }
}