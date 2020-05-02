package by.alhr.Hw9_Task4_Shop.service;

import by.alhr.Hw9_Task4_Shop.bean.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShopServiceTest {

    @Test
    public void addProduct() {
        ShopService shopServiceTest = new ShopService();
        Set<Product> shopServiceSetTest=new HashSet<>();

        Product productTest1 = new Product("1", new BigDecimal("1.11"));
        Product productTest2 = new Product("2", new BigDecimal("2.22"));

        shopServiceSetTest.add(productTest1);
        shopServiceSetTest.add(productTest2);

        shopServiceTest.addProduct(productTest1);
        shopServiceTest.addProduct(productTest2);

        assertEquals(shopServiceSetTest, shopServiceTest.shopServiceSet);
    }

    @Test
    public void deleteProduct() {
        ShopService shopServiceTest = new ShopService();
        Set<Product> shopServiceSetTest=new HashSet<>();

        Product productTest1 = new Product("1", new BigDecimal("1.11"));
        Product productTest2 = new Product("2", new BigDecimal("2.22"));

        shopServiceTest.addProduct(productTest1);
        shopServiceTest.addProduct(productTest2);

        shopServiceSetTest.remove(productTest1);
        shopServiceTest.deleteProduct(productTest1);

        assertEquals(1, shopServiceTest.shopServiceSet.size());
    }

    @Test
    public void searchProductByName() {
        ShopService shopServiceTest = new ShopService();
        Set<Product> shopServiceSetTest=new HashSet<>();

        Product productTest1 = new Product("1", new BigDecimal("1.11"));
        Product productTest2 = new Product("2", new BigDecimal("2.22"));
        Product productTest3 = new Product("3", new BigDecimal("3.33"));

        shopServiceTest.addProduct(productTest1);
        shopServiceTest.addProduct(productTest2);
        shopServiceTest.addProduct(productTest3);

        assertEquals(productTest2, shopServiceTest.searchProductByName("2"));
    }

    @Test
    public void findProductByPriceRange() {
        ShopService shopServiceTest = new ShopService();
        Set<Product> shopServiceSetTest=new HashSet<>();

        Product productTest1 = new Product("1", new BigDecimal("1.11"));
        Product productTest2 = new Product("2", new BigDecimal("2.22"));
        Product productTest3 = new Product("3", new BigDecimal("3.33"));
        Product productTest4 = new Product("4", new BigDecimal("4.44"));
        Product productTest5 = new Product("5", new BigDecimal("5.55"));

        shopServiceSetTest.add(productTest2);
        shopServiceSetTest.add(productTest3);
        shopServiceSetTest.add(productTest4);

        shopServiceTest.addProduct(productTest1);
        shopServiceTest.addProduct(productTest2);
        shopServiceTest.addProduct(productTest3);
        shopServiceTest.addProduct(productTest4);
        shopServiceTest.addProduct(productTest5);

        assertEquals(shopServiceSetTest, shopServiceTest.findProductByPriceRange(new BigDecimal(2.0),new BigDecimal(5.0)));
    }
}
