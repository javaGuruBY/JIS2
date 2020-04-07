package acya.ki.service;

import org.testng.AssertJUnit;

import static org.testng.Assert.*;

public class ArrayServiceTest {

    ArrayService arrayServiceTest =new ArrayService();
    int[] arrayTest = {6,7,8,9};

    @org.testng.annotations.Test
    public void testCreate() {
        AssertJUnit.assertEquals(6, arrayServiceTest.create(6).length);
    }

    @org.testng.annotations.Test
    public void testSum() {
        AssertJUnit.assertEquals(30, arrayServiceTest.sum(arrayTest));
    }

    @org.testng.annotations.Test
    public void testAvg() {
        AssertJUnit.assertEquals(7.5, arrayServiceTest.avg(arrayTest));
    }
}