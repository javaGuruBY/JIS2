package com.kachenya.service.repozitory;

import com.kachenya.been.Product;
import com.kachenya.enumes.Category;
import com.kachenya.repozitory.ProductCollection;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class ProductCollectionTest {
    @Test
    public void addTest() {
        HashMap<Long, Product> expected = new HashMap<>();
        Product expectedProduct = new Product();
        expectedProduct.setId(0);
        expected.put(expectedProduct.getId(), expectedProduct);

        ProductCollection actual = new ProductCollection();
        Product actualProduct = new Product();
        actualProduct.setId(0);
        actual.add(actualProduct);

        Assert.assertEquals(expected, actual.getStock());
    }

    @Test
    public void addMoreTest() {
        HashMap<Long, Product> expected = new HashMap<>();
        Product expectedProduct1 = new Product();
        Product expectedProduct2 = new Product();
        Product expectedProduct3 = new Product();
        expected.put(expectedProduct1.getId(), expectedProduct1);
        expected.put(expectedProduct2.getId(), expectedProduct2);
        expected.put(expectedProduct3.getId(), expectedProduct3);

        ProductCollection actual = new ProductCollection();
        actual.addMore(expected);

        Assert.assertEquals(expected, actual.getStock());

    }

    @Test
    public void removeByIdTest() {
        HashMap<Long, Product> expected = new HashMap<>();
        Product expectedProduct1 = new Product();
        Product expectedProduct2 = new Product();
        Product expectedProduct3 = new Product();
        expected.put(expectedProduct1.getId(), expectedProduct1);
        expected.put(expectedProduct2.getId(), expectedProduct2);
        expected.put(expectedProduct3.getId(), expectedProduct3);

        ProductCollection actual = new ProductCollection();
        actual.setStock(expected);
        actual.removeById(2);
        expected.remove(2);
        Assert.assertEquals(expected, actual.getStock());
    }

    @Test
    public void removeAllTesst() {
        HashMap<Long, Product> stock = new HashMap<>();

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        stock.put(product1.getId(), product1);
        stock.put(product2.getId(), product2);
        stock.put(product3.getId(), product3);

        ProductCollection actual = new ProductCollection();
        actual.setStock(stock);
        actual.removeAll();
        HashMap<Long, Product> expected = new HashMap<>();

        Assert.assertEquals(expected, actual.getStock());
    }

    @Test
    public void findeByIdTest() {
        HashMap<Long, Product> stock = new HashMap<>();

        Product product1 = new Product();
        product1.setPrice(new BigDecimal(100));
        product1.setId(0);

        Product product2 = new Product();
        product2.setId(1);
        Product product3 = new Product();
        product3.setId(3);
        stock.put(product1.getId(), product1);
        stock.put(product2.getId(), product2);
        stock.put(product3.getId(), product3);

        Product expected = new Product();
        expected.setPrice(new BigDecimal(100));
        ProductCollection actualCollection = new ProductCollection();
        actualCollection.setStock(stock);
        Product actual = actualCollection.findeById(0L);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAllByCategoryTest() {
        List<Product> exepted = new LinkedList<>();

        Product exeptedProduct1 = new Product();
        exeptedProduct1.setName("First product");
        exeptedProduct1.setCategory(Category.FRUIT);

        Product exeptedProduct2 = new Product();
        exeptedProduct2.setName("second product");
        exeptedProduct2.setCategory(Category.MEAT);

        Product exeptedProduct3 = new Product();
        exeptedProduct3.setName("Third product");
        exeptedProduct3.setCategory(Category.FRUIT);
        exepted.add(exeptedProduct1);
        exepted.add(exeptedProduct3);


        ProductCollection collection = new ProductCollection();

        HashMap<Long, Product> stock = new HashMap<>();
        stock.put(exeptedProduct1.getId(), exeptedProduct1);
        stock.put(exeptedProduct2.getId(), exeptedProduct2);
        stock.put(exeptedProduct3.getId(), exeptedProduct3);
        collection.setStock(stock);

        List<Product> actual = collection.findAllByCategory(Category.FRUIT);
        Assert.assertEquals(exepted, actual);
    }

    @Test
    public void setDiscontAllProductCertainCategoryTest() {
        Map<Long, Product> exepted = new HashMap<>();
        Product exeptedProduct1 = new Product();
        exeptedProduct1.setName("First product");
        exeptedProduct1.setDiscount(new BigDecimal(0.15));
        exeptedProduct1.setCategory(Category.FRUIT);

        Product exeptedProduct2 = new Product();
        exeptedProduct2.setName("second product");
        exeptedProduct2.setCategory(Category.MEAT);

        Product exeptedProduct3 = new Product();
        exeptedProduct3.setName("Third product");
        exeptedProduct3.setCategory(Category.FRUIT);
        exeptedProduct3.setDiscount(new BigDecimal(0.15));
        exepted.put(exeptedProduct1.getId(), exeptedProduct1);
        exepted.put(exeptedProduct2.getId(), exeptedProduct2);
        exepted.put(exeptedProduct3.getId(), exeptedProduct3);


        ProductCollection collection = new ProductCollection();

        HashMap<Long, Product> stock = new HashMap<>();
        Product actualProduct1 = new Product();
        actualProduct1.setName("First product");
        actualProduct1.setCategory(Category.FRUIT);

        Product actualProduct2 = new Product();
        actualProduct1.setName("Second product");
        actualProduct1.setCategory(Category.MEAT);

        Product actualProduct3 = new Product();
        actualProduct1.setName("Third product");
        actualProduct1.setCategory(Category.FRUIT);
        stock.put(actualProduct1.getId(),actualProduct1);
        stock.put(actualProduct2.getId(),actualProduct2);
        stock.put(actualProduct3.getId(),actualProduct3);
        ProductCollection actual=new ProductCollection();
        actual.setStock(stock);

        actual.setDiscontAllProductCertainCategory(Category.FRUIT,new BigDecimal(0.15));

        Assert.assertEquals(exepted.get(0),actual.getStock().get(3));
        Assert.assertEquals(exepted.get(1),actual.getStock().get(4));
        Assert.assertEquals(exepted.get(2),actual.getStock().get(5));

    }
}
