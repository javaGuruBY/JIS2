package by.alhr.Hw10_Task1_User;

import by.alhr.Hw10_Task1_User.bean.User;
import by.alhr.Hw10_Task1_User.exception.UserValidationException;
import by.alhr.Hw10_Task1_User.service.UserValidationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw10Task1UserValidationServiceApplication {

	public static void main(String[] args) throws UserValidationException {
		UserValidationService userValidationService=new UserValidationService();
		userValidationService.validate(new User("Aliaksandr","Horosko",80));
		userValidationService.validate(new User("Ir","Help",50));
		userValidationService.validate(new User("Irrina","Оченьдлиннаяфамилия",50));
		userValidationService.validate(new User("Irrina","Help",121));
	}

}
