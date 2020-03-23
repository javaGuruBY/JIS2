package by.home.service;

import  by.home.bean.Product;

public class ProductService {
    Product product; {

    }

    public double actualPrice(Product product) {
        return (product.getRegularPrice() - (product.getRegularPrice()*product.getDiscount())/100);

    }
    public void printInformation(Product product){
        System.out.println("Product : name = " + product.getName() + "\nregular price = " + product.getRegularPrice() + "$" + "\ndiscount = " + product.getDiscount() + "%" + "\nactual price = " + actualPrice(product) + "$");
    }
}
