package by.alhr;

import by.alhr.bean.Product;
import by.alhr.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Coffee", 20 , 5 );
        ProductService productService = new ProductService();
        productService.printInformation(product);
        Product product1 = new Product("Tea", 10 , 10);
        ProductService productService1 = new ProductService();
        productService1.printInformation(product1);
    }
}
