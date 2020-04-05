package acya.ki;

import acya.ki.bean.Product;
import acya.ki.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product firstProduct = new Product("Milk", 2, 20);
        Product secondProduct = new Product("Eggs", 4, 50);
        ProductService productService = new ProductService();
        productService.actualPrice(secondProduct);

    }
}
