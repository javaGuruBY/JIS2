package by.alhr.Hw4_Task5_UserLoginService;

import by.alhr.Hw4_Task5_UserLoginService.service.UserLoginService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw4Task5UserLoginServiceDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new UserLoginService());
		thread.start();
//		SpringApplication.run(Hw4Task5UserLoginServiceDemo.class, args);
	}

}
