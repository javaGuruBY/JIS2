package by.seven.service;

import by.seven.bean.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    protected Set<Product> productShop = new HashSet<>();

    public void addProduct(Product product) {
        productShop.add(product);
    }

    public void deleteProduct(Product product) {
        productShop.remove(product);
    }

    public Product findProductByName(String nameProduct) {
        for (Product product: productShop) {
            if (product.getNameOfProduct().equals(nameProduct)) {
                System.out.println("Found:" + product);
                return product;
            }

        }return null;
    }

    public Set<Product> findProductsByPrice(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        Set<Product> products = new HashSet<>();
        for (Product product: productShop) {
            if (product.getPrice().compareTo(minPriceRange) == 1
                    && product.getPrice().compareTo(maxPriceRange) == - 1) {
                System.out.println(product);
            }
        }return products;
    }
}
