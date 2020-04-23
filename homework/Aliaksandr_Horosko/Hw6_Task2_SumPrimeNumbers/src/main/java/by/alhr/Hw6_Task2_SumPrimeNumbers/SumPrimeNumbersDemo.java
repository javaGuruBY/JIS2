package by.alhr.Hw6_Task2_SumPrimeNumbers;

import by.alhr.Hw6_Task2_SumPrimeNumbers.service.PrimeNumbers;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumPrimeNumbersDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new PrimeNumbers());
		thread.start();
		
//		SpringApplication.run(SumPrimeNumbersApplication.class, args);
	}

}
