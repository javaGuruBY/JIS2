package by.alhr.Hw6_Task4_Car;

import by.alhr.Hw6_Task4_Car.service.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw6Task4CarApplication {

	public static void main(String[] args) {
		Thread thread=new Thread(new CarService());
		thread.start();
	}
//		SpringApplication.run(Hw6Task4CarApplication.class, args);
}

