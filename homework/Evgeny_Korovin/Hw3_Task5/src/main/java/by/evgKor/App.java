package by.evgKor;

import by.evgKor.bean.Product;
import by.evgKor.service.ProductService;

public class App {
    public static void main(String[] args) {
        Product beer=new Product("beer Bud",2.5,20);
        ProductService productService=new ProductService();
        productService.printInformation(beer);
        Product coffee=new Product("coffee Ionia",16,25);
        ProductService productService2 =new ProductService();
        productService.printInformation(coffee);



    }
}
