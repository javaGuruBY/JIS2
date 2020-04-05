package acya.ki.bean;

import org.testng.Assert;
import org.testng.AssertJUnit;

import static org.testng.Assert.*;

public class PowerCalculatorTest {

    @org.testng.annotations.Test
    public void testExponentiation() {
        PowerCalculator powerCalculatorTest = new PowerCalculator();

        Assert.assertEquals((int)Math.pow(4,5), powerCalculatorTest.exponentiation(4, 5));
        Assert.assertEquals(1, powerCalculatorTest.exponentiation(-4, 5));

    }
}