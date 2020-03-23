package by.home;

import by.home.bean.Product;
import by.home.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product(" Milk ", 40 , 5);
        ProductService productService = new ProductService();
        productService.printInformation(product);
        Product product1 = new Product( " tea " , 20 , 10 );
        ProductService productService1 = new ProductService();
        productService1.printInformation(product1);
    }
}
