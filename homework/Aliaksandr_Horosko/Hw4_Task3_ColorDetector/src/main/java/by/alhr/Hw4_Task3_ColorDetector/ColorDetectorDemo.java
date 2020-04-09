package by.alhr.Hw4_Task3_ColorDetector;

import by.alhr.Hw4_Task3_ColorDetector.service.LightColorDetectorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorDetectorDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new LightColorDetectorService());
		thread.start();
//		SpringApplication.run(ColorDetectorDemo.class, args);
	}

}
