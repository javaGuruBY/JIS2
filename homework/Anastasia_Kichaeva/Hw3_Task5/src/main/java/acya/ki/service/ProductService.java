package acya.ki.service;

import acya.ki.bean.Product;

public class ProductService {
    private Product product;

    public ProductService(){

    }
    public ProductService(String name, double regularPrice, double discount){
        product.setName(name);
        product.setRegularPrice(regularPrice);
        product.setDiscount(discount);
    }

    public void actualPrice(Product product){
        System.out.println("Product : name = " + product.getName() + ", regular price = " + product.getRegularPrice() +
                " EUR, discount = " + product.getDiscount() + "%, actual price = " + (product.getRegularPrice() - (product.getRegularPrice() * product.getDiscount()) / 100) + " EUR");

    }




}
