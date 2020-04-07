package by.serg.service;

import by.serg.bean.Product;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Product> productList = new LinkedList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void removeProductByIndex(int index) {
        productList.remove(index);
    }

    public Product findByName(String name) {
        for (Product product: productList) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product[] findByPriceRange(BigDecimal minProductPrice, BigDecimal maxProductPrice) {
        int counterToInitializeArray = 0;
        for (Product product: productList) {
            if(product.getPrice().max(minProductPrice).compareTo(product.getPrice()) == 0 && product.getPrice().min(maxProductPrice).compareTo(product.getPrice()) == 0) {
                counterToInitializeArray++;
            }
        }
        Product[] products = new Product[counterToInitializeArray];
        int counterForFillingArray = 0;
        for (Product product: productList) {
            if(product.getPrice().max(minProductPrice).compareTo(product.getPrice()) == 0 && product.getPrice().min(maxProductPrice).compareTo(product.getPrice()) == 0) {
                products[counterForFillingArray] = product;
                counterForFillingArray++;
            }
        }
        return products;
    }
}
