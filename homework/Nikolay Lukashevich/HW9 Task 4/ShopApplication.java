package by.lukash.Shop;

import by.lukash.Shop.bean.Product;
import by.lukash.Shop.service.ShopService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {

		Product product = new Product(1, "product", new BigDecimal(99999.99));
		Product product1 = new Product(2, "product1", new BigDecimal(33333.99));
		Product product2 = new Product(3, "product2", new BigDecimal(11111.99));
		ShopService shop = new ShopService();
		shop.addProduct(product);
		shop.addProduct(product1);
		shop.addProduct(product2);

		Integer productFromRepository = product1.getId();
		System.out.println("id of " + product1.getName() + " is: " + productFromRepository);


//		SpringApplication.run(ShopApplication.class, args);
	}

}
