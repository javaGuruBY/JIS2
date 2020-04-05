package by.alhr.Hw5_task2_book;

import by.alhr.Hw5_task2_book.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw5Task2BookApplication {

	public static void main(String[] args) {
		Thread thread = new Thread(new BookService());
		thread.start();
//		SpringApplication.run(Hw5Task2BookApplication.class, args);
	}

}
