package by.evgKor.jisTwo;

import by.evgKor.jisTwo.service.CounterService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JisTwoApplication {
	public static void main(String[] args) {
		Thread thread=new Thread(new CounterService());
		thread.start();


		//SpringApplication.run(JisTwoApplication.class, args);
	}

}
