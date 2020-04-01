package by.serg;

import by.serg.bean.Product;
import by.serg.service.Shop;

import java.math.BigDecimal;
import java.util.Arrays;

public class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product = new Product("Milk", new BigDecimal("1.789"));
        Product product1 = new Product("Bread", new BigDecimal("1.012"));
        Product product2 = new Product("Vodka \"Air\"", new BigDecimal("7.69"));
        Product product3 = new Product("Ketchup", new BigDecimal("2.015"));
        shop.addProduct(product);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        System.out.println(shop.findByName("Bread"));
        System.out.println(Arrays.toString(shop.findByPriceRange(new BigDecimal("1.012"), new BigDecimal("2.015"))));
        shop.removeProduct(product3);
        System.out.println(shop.findByName("Ketchup"));
    }
}
