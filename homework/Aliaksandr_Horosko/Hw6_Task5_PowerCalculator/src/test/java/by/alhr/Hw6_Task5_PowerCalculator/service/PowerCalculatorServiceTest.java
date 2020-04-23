package by.alhr.Hw6_Task5_PowerCalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerCalculatorServiceTest {

    @Test
   public void exponentiation() {
        PowerCalculatorService powerCalculatorTest=new PowerCalculatorService();
        int number = 2;
        int power = 5;
        int exeption = 32;
        int actual = powerCalculatorTest.exponentiation(number,power);
        assertEquals(exeption,actual);
    }
}