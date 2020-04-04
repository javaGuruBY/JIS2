package by.home;

import by.home.bean.Product;
import by.home.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product(" Milk ", 40 , 5);
        ProductService productService = new ProductService();
        productService.printInformation(product1);
        System.out.println("Actual price: " + productService.actualPrice(product1));
        Product product2 = new Product( " tea " , 20 , 10 );
        productService.printInformation(product2);
        System.out.println("Actual price: " + productService.actualPrice(product2));
    }
}
