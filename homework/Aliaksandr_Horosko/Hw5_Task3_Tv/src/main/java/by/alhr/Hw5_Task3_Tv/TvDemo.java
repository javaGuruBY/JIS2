package by.alhr.Hw5_Task3_Tv;

import by.alhr.Hw5_Task3_Tv.service.TvService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TvDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new TvService());
		thread.run();

//		SpringApplication.run(Hw5Task3TvApplication.class, args);
	}

}
