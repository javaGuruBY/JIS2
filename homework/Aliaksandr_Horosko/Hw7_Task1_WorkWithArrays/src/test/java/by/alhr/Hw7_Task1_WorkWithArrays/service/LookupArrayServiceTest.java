package by.alhr.Hw7_Task1_WorkWithArrays.service;

import by.alhr.Hw7_Task1_WorkWithArrays.bean.LookupArray;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {
    LookupArray lookupArrayTest1 = new LookupArray(new  int[]{15, 5, 102, 18, 222, 99, 18}, 18);
    LookupArray lookupArrayTest2 = new LookupArray(new  int[]{}, 25);
    LookupArrayService lookupArrayServiceTest = new LookupArrayService();


       @Test
     void findMax() {
        Assert.assertEquals(222,lookupArrayServiceTest.findMax(lookupArrayTest1));
        Assert.assertEquals(0,lookupArrayServiceTest.findMax(lookupArrayTest2));
    }

    @Test
    void findMin() {
        Assert.assertEquals(5,lookupArrayServiceTest.findMin(lookupArrayTest1));
        Assert.assertEquals(0,lookupArrayServiceTest.findMin(lookupArrayTest2));
    }

    @Test
    void indexOfMax() {
        Assert.assertEquals(4,lookupArrayServiceTest.indexOfMax(lookupArrayTest1));
        Assert.assertEquals(-1,lookupArrayServiceTest.indexOfMax(lookupArrayTest2));
    }

    @Test
    void indexOfMin() {
        Assert.assertEquals(1,lookupArrayServiceTest.indexOfMin(lookupArrayTest1));
        Assert.assertEquals(-1,lookupArrayServiceTest.indexOfMin(lookupArrayTest2));
    }

    @Test
    void indexOf() {
        Assert.assertEquals(3,lookupArrayServiceTest.indexOf(lookupArrayTest1));
        Assert.assertEquals(-1,lookupArrayServiceTest.indexOf(lookupArrayTest2));
    }
}