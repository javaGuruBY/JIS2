package by.serg;


import by.serg.bean.Product;
import by.serg.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Milk");
        ProductService productService = new ProductService();
        product1.setDiscount(40);
        product1.setRegularPrice(1.7);
        productService.printInformation(product1);
    }
}
