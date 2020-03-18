package by.serg.service;

import by.serg.bean.Product;

public class ProductService {

    public double actualPrice(Product product) {
        return product.getRegularPrice()*(100-product.getDiscount())/100;
    }

    public void printInformation(Product product) {
        System.out.println("Product : name = " + product.getName() + ", regular price = " + product.getRegularPrice() + " BYN, discount = " + product.getDiscount() + "%, actual price = " + actualPrice(product) + " BYN");
    }
}
