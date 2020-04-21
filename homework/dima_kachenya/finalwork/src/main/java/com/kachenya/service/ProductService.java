package com.kachenya.service;

import com.kachenya.been.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductService {

    public static void addDiscount(BigDecimal discount, Product product) {
        product.setDiscount(discount.setScale(2, RoundingMode.HALF_UP));
        BigDecimal actualPriceInPersent = new BigDecimal(1).subtract(discount).setScale(2, RoundingMode.HALF_UP);
        product.setActualPrice(product.getPrice().multiply(actualPriceInPersent));
    }

    public static void addDescription(
            String description, Product product) {
        product.setDescription(description);
    }

}
