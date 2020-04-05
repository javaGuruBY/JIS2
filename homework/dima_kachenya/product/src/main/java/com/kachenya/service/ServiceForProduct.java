package com.kachenya.service;

import com.kachenya.bean.Product;

public class ServiceForProduct {
    private Product product=new Product();

    public ServiceForProduct() {
    }

    public ServiceForProduct(String name, double regulaPrice, double discount) {
        product.setDiscount(discount);
        product.setName(name);
        product.setRegularPrice(regulaPrice);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double actualPrice() {
        return product.getRegularPrice() * (1 - product.getDiscount());
    }

    public void printIfo() {
        System.out.println(
                "Product:\n" +
                        "name: " + product.getName() + ";" +
                        "\n\tregular price: " + product.getRegularPrice() + " EUR;" +
                        "\n\tdiscount: " + (product.getDiscount() * 100) + "%;" +
                        "\n\tactual price: " + actualPrice() + " EUR."
        );
    }
}
