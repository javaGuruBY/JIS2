package by.alhr.Hw7_Task1_WorkWithArrays.service;

import by.alhr.Hw7_Task1_WorkWithArrays.bean.LookupArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LookupArrayServiceTest {

       @Test
       public void findMax() {
           LookupArray lookupArrayTest1 = new LookupArray(new  int[]{15, 5, 102, 18, 222, 99, 18}, 18);
           LookupArray lookupArrayTest2 = new LookupArray(new  int[]{}, 25);
           LookupArrayService lookupArrayServiceTest = new LookupArrayService();
       assertEquals(222,lookupArrayServiceTest.findMax(lookupArrayTest1));
      assertEquals(0,lookupArrayServiceTest.findMax(lookupArrayTest2));
    }

    @Test
    public void findMin() {
        LookupArray lookupArrayTest1 = new LookupArray(new  int[]{15, 5, 102, 18, 222, 99, 18}, 18);
        LookupArray lookupArrayTest2 = new LookupArray(new  int[]{}, 25);
        LookupArrayService lookupArrayServiceTest = new LookupArrayService();
      assertEquals(5,lookupArrayServiceTest.findMin(lookupArrayTest1));
       assertEquals(0,lookupArrayServiceTest.findMin(lookupArrayTest2));
    }

    @Test
    public void indexOfMax() {
        LookupArray lookupArrayTest1 = new LookupArray(new  int[]{15, 5, 102, 18, 222, 99, 18}, 18);
        LookupArray lookupArrayTest2 = new LookupArray(new  int[]{}, 25);
        LookupArrayService lookupArrayServiceTest = new LookupArrayService();
      assertEquals(4,lookupArrayServiceTest.indexOfMax(lookupArrayTest1));
        assertEquals(-1,lookupArrayServiceTest.indexOfMax(lookupArrayTest2));
    }

    @Test
    public void indexOfMin() {
        LookupArray lookupArrayTest1 = new LookupArray(new  int[]{15, 5, 102, 18, 222, 99, 18}, 18);
        LookupArray lookupArrayTest2 = new LookupArray(new  int[]{}, 25);
        LookupArrayService lookupArrayServiceTest = new LookupArrayService();
      assertEquals(1,lookupArrayServiceTest.indexOfMin(lookupArrayTest1));
      assertEquals(-1,lookupArrayServiceTest.indexOfMin(lookupArrayTest2));
    }

    @Test
    public void indexOf() {
        LookupArray lookupArrayTest1 = new LookupArray(new  int[]{15, 5, 102, 18, 222, 99, 18}, 18);
        LookupArray lookupArrayTest2 = new LookupArray(new  int[]{}, 25);
        LookupArrayService lookupArrayServiceTest = new LookupArrayService();
       assertEquals(3,lookupArrayServiceTest.indexOf(lookupArrayTest1));
     assertEquals(-1,lookupArrayServiceTest.indexOf(lookupArrayTest2));
    }
}