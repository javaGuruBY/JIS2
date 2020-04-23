package by.alhr.Hw7_Task4_Palindrome;

import by.alhr.Hw7_Task4_Palindrome.service.Palindrome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw7Task4PalindromeDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new Palindrome());
		thread.start();
//		SpringApplication.run(Hw7Task4PalindromeDemo.class, args);
	}

}
