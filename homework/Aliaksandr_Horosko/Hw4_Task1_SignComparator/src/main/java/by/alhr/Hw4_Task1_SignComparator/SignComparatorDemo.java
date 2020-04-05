package by.alhr.Hw4_Task1_SignComparator;

import by.alhr.Hw4_Task1_SignComparator.service.SignComparator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SignComparatorDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new SignComparator());
		thread.start();
//		SpringApplication.run(SignComparatorDemo.class, args);
	}

}
