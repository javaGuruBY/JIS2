package by.alhr.Hw6_Task5_PowerCalculator;

import by.alhr.Hw6_Task5_PowerCalculator.service.PowerCalculatorService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw6Task5PowerCalculatorDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new PowerCalculatorService());
		thread.start();
//		SpringApplication.run(Hw6Task5PowerCalculatorDemo.class, args);
	}

}
