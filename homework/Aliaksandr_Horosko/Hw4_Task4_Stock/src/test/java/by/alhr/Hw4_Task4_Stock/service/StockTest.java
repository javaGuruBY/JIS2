package by.alhr.Hw4_Task4_Stock.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StockTest {

    @Test
   public void updatePrice() {
        Stock stockTest = new Stock("Alibastra", 50);
        String expected = "Company name = Alibastra, current price = 38.0 $, maximum price = 150.0 $, minimal price = 22.0$";

        stockTest.updatePrice(150);
        stockTest.updatePrice(22);
        stockTest.updatePrice(38);

        String actual = stockTest.printInformation();
        assertEquals(expected, actual);
    }

    @Test
    public void printInformation() {
        Stock stockTest = new Stock("Alibastra", 200);
        String expected = "Company name = Alibastra, current price = 200.0 $, maximum price = 200.0 $, minimal price = 200.0$";
        String actual = stockTest.printInformation();
        assertEquals(expected, actual);
    }
}