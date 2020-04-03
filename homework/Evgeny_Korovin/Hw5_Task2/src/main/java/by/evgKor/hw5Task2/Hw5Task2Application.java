package by.evgKor.hw5Task2;

import by.evgKor.hw5Task2.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw5Task2Application {

	public static void main(String[] args) {
		Thread thread=new Thread(new BookService());
		thread.start();

//		SpringApplication.run(Hw5Task2Application.class, args);
	}

}
