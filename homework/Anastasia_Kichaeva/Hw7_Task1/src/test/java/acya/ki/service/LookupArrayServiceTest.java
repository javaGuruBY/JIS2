package acya.ki.service;

import org.testng.AssertJUnit;

import static org.testng.Assert.*;

public class LookupArrayServiceTest {

    LookupArrayService lookupArrayServiceTest = new LookupArrayService();

    int[] arrayTest = {34, 5, 42, 18, 99, 63, 0, 18};
    int[] arrayTest2 = {0,0,0,0,0,0,0};

    @org.testng.annotations.Test
    public void testIsArrayEmpty() {
        AssertJUnit.assertEquals(false, lookupArrayServiceTest.isArrayEmpty(arrayTest));
        AssertJUnit.assertEquals(true, lookupArrayServiceTest.isArrayEmpty(arrayTest2));
    }

    @org.testng.annotations.Test
    public void testFindMax() {
        AssertJUnit.assertEquals(99, lookupArrayServiceTest.findMax(arrayTest));
        AssertJUnit.assertEquals(0, lookupArrayServiceTest.findMax(arrayTest2));
    }

    @org.testng.annotations.Test
    public void testFindMin() {
        AssertJUnit.assertEquals(0, lookupArrayServiceTest.findMin(arrayTest));
        AssertJUnit.assertEquals(0, lookupArrayServiceTest.findMin(arrayTest2));
    }

    @org.testng.annotations.Test
    public void testIndexOfMax() {
        AssertJUnit.assertEquals(4, lookupArrayServiceTest.indexOfMax(arrayTest));
        AssertJUnit.assertEquals(-1, lookupArrayServiceTest.indexOfMax(arrayTest2));
    }

    @org.testng.annotations.Test
    public void testIndexOfMin() {
        AssertJUnit.assertEquals(6, lookupArrayServiceTest.indexOfMin(arrayTest));
        AssertJUnit.assertEquals(-1, lookupArrayServiceTest.indexOfMin(arrayTest2));
    }

    @org.testng.annotations.Test
    public void testIndexOf() {
        AssertJUnit.assertEquals(3, lookupArrayServiceTest.indexOf(arrayTest, 18));
        AssertJUnit.assertEquals(-1, lookupArrayServiceTest.indexOf(arrayTest2, 18));
    }
}