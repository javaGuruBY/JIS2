package by.lukash.counter;

import by.lukash.counter.service.CounterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CounterApplication.class, args);
		Thread thread = new Thread((Runnable) new CounterService());
		thread.run();
	}

}
