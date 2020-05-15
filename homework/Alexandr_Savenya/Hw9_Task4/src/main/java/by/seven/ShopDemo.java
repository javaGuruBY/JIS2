package by.seven;

import by.seven.bean.Product;
import by.seven.service.Shop;

import java.math.BigDecimal;

public class ShopDemo {
    public static void main(String[] args) {

        Product product1 = new Product("Milk", new BigDecimal("1.35"));
        Product product2 = new Product("Tea", new BigDecimal("3,50"));
        Product product3 = new Product("Bread", new BigDecimal("1.15"));

        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.findProductByName("Milk");
        shop.findProductsByPrice(new BigDecimal("1,30"), new BigDecimal("4"));
    }
}
