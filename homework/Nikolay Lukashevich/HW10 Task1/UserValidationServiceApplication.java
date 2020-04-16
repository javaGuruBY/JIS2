package by.lukash.UserValidationService;

import by.lukash.UserValidationService.Exception.UserValidationException;
import by.lukash.UserValidationService.bean.User;
import by.lukash.UserValidationService.service.UserValidationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserValidationServiceApplication {

	public static void main(String[] args) throws UserValidationException {
		UserValidationService userValidationService = new UserValidationService();
		userValidationService.validate(new User("Nikolay","Lukashevich", 27));
		userValidationService.validate(new User("Kati","Lukashevich", 26));
		userValidationService.validate(new User("AI", "blabla", 120));
	}


		//		SpringApplication.run(UserValidationServiceApplication.class, args);
	}


