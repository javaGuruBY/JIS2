package by.alhr.service;

import by.alhr.bean.Product;

public class ProductService {
    public double actualPrice(Product product) {
        return (product.getRegularPrice() - (product.getRegularPrice() * product.getDiscount()) / 100);
    }

    public void printInformation(Product product) {
        System.out.println(
                "Product : name = "
                        + product.getName()
                        + "\nregular price = " + product.getRegularPrice()
                        + "$" + "\ndiscount = " + product.getDiscount() + "%"
                        + "\nactual price = " + actualPrice(product) + "$");
        //Product : name = "Milk", regular price = 0.8 EUR, discount = 20%, actual price = 0.64 EUR
    }
}
