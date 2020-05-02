package by.alhr.Hw9_Task4_Shop;

import by.alhr.Hw9_Task4_Shop.bean.Product;
import by.alhr.Hw9_Task4_Shop.service.ShopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task4ShopApplication {

    public static void main(String[] args) {
        Product product1 = new Product("Beer", new BigDecimal("9.15"));
        Product product2 = new Product("Hleb", new BigDecimal("0.158"));
        Product product3 = new Product("Salo", new BigDecimal("12.0"));
        Product product4 = new Product("Maslo", new BigDecimal("10.11"));
        Product product5 = new Product("Orange", new BigDecimal("6.18"));
        Product product6 = new Product("Milk", new BigDecimal("11.11"));
        ShopService shopService = new ShopService();
        shopService.addProduct(product1);
        shopService.addProduct(product2);
        shopService.addProduct(product3);
        shopService.addProduct(product4);
        shopService.addProduct(product5);
        shopService.addProduct(product6);
        shopService.searchProductByName("Salo");
        shopService.findProductByPriceRange(new BigDecimal(6.0), new BigDecimal(11.0));
        shopService.deleteProduct(product2);
    }
//		SpringApplication.run(Hw9Task4ShopApplication.class, args);
}
