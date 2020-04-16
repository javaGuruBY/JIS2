package by.alhr.Hw7_Task3_SortSwap.service;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class ArrayServiceTest {
    ArrayService arrayServiceTest = new ArrayService();
    int[] arrayTest = new int[]{12, 2, 8, 14, 4};
    int[] arrayTest1 = new int[]{};

    @Test
    void create() {
        Assert.assertEquals(4, arrayServiceTest.create(4).length);

    }

    @Test
    void sum() {
        Assert.assertEquals(40, arrayServiceTest.sum(arrayTest));
        Assert.assertEquals(0, arrayServiceTest.sum(arrayTest1));
    }


    @Test
    void avg() {
        Assert.assertEquals(8.0, arrayServiceTest.avg(arrayTest), 10 ^ 6);
        Assert.assertEquals(0, arrayServiceTest.avg(arrayTest1), 10 ^ 6);

    }

    @Test
    void sort() {
        int[] result = arrayServiceTest.sort(arrayTest);
        int[] expect = new int[]{2, 4, 8, 12, 14};
        assertThat(result, Matchers.is(expect));

    }

}