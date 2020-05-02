package by.alhr.Hw9_Task4_Shop.service;

import by.alhr.Hw9_Task4_Shop.bean.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ShopService {
    Set<Product> shopServiceSet = new HashSet<>();

    public void addProduct(Product product) {
        shopServiceSet.add(product);
        System.out.println(product);
    }

    public void deleteProduct(Product product) {
        shopServiceSet.remove(product);
        System.out.println("\nProduct which was been removed");
        System.out.println(product);
    }

    public Product searchProductByName(String name) {
        for (Product products : shopServiceSet) {
            if (products.getProductName().equals(name)) {
                System.out.println("\nsearchProductByName: " + products);
                return products;
            }
        }
        return null;
    }

    public Set<Product> findProductByPriceRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        System.out.println("\nfindProductByPriceRange: ");
        Set<Product> productList = new HashSet<>();
        for (Product productByPriceRange : shopServiceSet) {
            if (productByPriceRange.getPrice().compareTo(minPriceRange) == 1
                    && productByPriceRange.getPrice().compareTo(maxPriceRange) == -1) {
                productList.add(productByPriceRange);
                System.out.println(productByPriceRange);
            }
        }
        return productList;
    }
}
