package by.alhr.Hw4_Task4_Stock;

import by.alhr.Hw4_Task4_Stock.service.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw4Task4StockDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new Stock());
		thread.start();
//		SpringApplication.run(Hw4Task4StockDemo.class, args);
	}

}
