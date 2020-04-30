package by.alhr.Hw9_Task4_Shop;

import by.alhr.Hw9_Task4_Shop.service.ShopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task4ShopApplication {

	public static void main(String[] args) {
		Thread thread = new Thread(new ShopService());
		thread.start();
//		SpringApplication.run(Hw9Task4ShopApplication.class, args);
	}

}
