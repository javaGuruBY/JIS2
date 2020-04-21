package com.kachenya.service;

import com.kachenya.been.Product;
import com.kachenya.enumes.Category;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ServiceConfigurationError;

public class ProductServiceTest {
    @Test
    public void addDiscountTest() {
        Product exeppted = new Product();
        exeppted.setPrice(new BigDecimal(100));
        exeppted.setDiscount(new BigDecimal(0.50));
        exeppted.setActualPrice(new BigDecimal(50.0));

        Product actual = new Product();
        actual.setPrice(new BigDecimal(100));

        ProductService.addDiscount(new BigDecimal(0.50), actual);

        Assert.assertEquals(exeppted, actual);
    }

    @Test
    public void addDescriptionTest(){

        Product exeppted = new Product();
        exeppted.setDescription("Hello world");

        Product actual = new Product();

        ProductService.addDescription("Hello world",actual);

        Assert.assertEquals(exeppted, actual);
    }

    @Test
    public void toStringTest(){
        String exepted="Product{name='Name', id=0, price=100, category=FRUIT, discount= 12.00%, actualPrice= 89.00 }";
        Product product =new Product("Name",new BigDecimal(100),Category.FRUIT);
        product.setDiscount(new BigDecimal(0.12));
        product.setId(0);
        product.setActualPrice(new BigDecimal(89));
        String actual=product.toString();
        Assert.assertEquals(exepted,actual);

        exepted="Product{name='Name', id=1, price=100, category=FRUIT }";
        Product product1 =new Product("Name",new BigDecimal(100),Category.FRUIT);
        product1.setId(1);
        actual=product1.toString();
        Assert.assertEquals(exepted,actual);

        exepted="Product{name='Name', id=2, price=100, category=FRUIT, discription= Hello world }";
        Product product2 =new Product("Name",new BigDecimal(100),Category.FRUIT);
        product2.setId(2);
        product2.setDescription("Hello world");
        actual=product2.toString();
        Assert.assertEquals(exepted,actual);
    }

}
