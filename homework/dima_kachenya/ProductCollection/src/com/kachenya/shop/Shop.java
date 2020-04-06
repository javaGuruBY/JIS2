package com.kachenya.shop;

import com.kachenya.shop.product.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Shop<T extends Product> {
    public Set<T> myShop = new HashSet<>();

    public void add(T myProduct) {
        myShop.add(myProduct);
    }

    public void removeProduct(T myProduct) {
        myShop.remove(myProduct);
    }

    public T findProductByName(String name) {
        for (T item :
                myShop) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        System.out.println("Product is not found");
        return null;
    }

    public Set<T> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        Set<T> myShopForReturn = new HashSet<>();
        for (T item :
                myShop) {
            if (item.getPrice().compareTo(minPriceRange) == 1 && item.getPrice().compareTo(maxPriceRange) == -1) {
                myShopForReturn.add(item);
            }
        }
        return myShopForReturn;
    }

    public void printAll() {
        for (T item :
                myShop) {
            System.out.println(item.toString());
        }
    }
}
