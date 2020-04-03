package by.evgKor.Hw5Task3;

import by.evgKor.Hw5Task3.service.TvService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw5Task3Application {

	public static void main(String[] args) {
	Thread thread=new Thread(new TvService());
	thread.start();
//		SpringApplication.run(Hw5Task3Application.class, args);
	}

}
