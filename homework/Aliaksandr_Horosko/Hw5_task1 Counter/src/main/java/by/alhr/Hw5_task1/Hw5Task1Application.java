package by.alhr.Hw5_task1;

import by.alhr.Hw5_task1.service.CounterService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw5Task1Application {

	public static void main(String[] args) {
		Thread thread = new Thread(new CounterService());
		thread.run();
//		SpringApplication.run(Hw5Task1Application.class, args);
	}

}
