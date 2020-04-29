package by.alhr.Hw9_Task2_UniqueWordCounter;

import by.alhr.Hw9_Task2_UniqueWordCounter.service.UniqueWordCounter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task2UniqueWordCounterDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new UniqueWordCounter());
		thread.start();
//		SpringApplication.run(Hw9Task2UniqueWordCounterDemo.class, args);
	}

}
