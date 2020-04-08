package by.serg;

import by.serg.bean.User;
import by.serg.exceptions.UserValidationException;
import by.serg.service.UserValidationService;

public class UserValidationDemo {
    public static void main(String[] args) throws UserValidationException {
        UserValidationService userValidationService = new UserValidationService();
        userValidationService.validate(new User("Eugene","Sergeev", 21));
        userValidationService.validate(new User("Abdul-Shamal-Ibn-Harum", "Vasnetsov", 57));
    }
}
