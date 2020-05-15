package by.seven;

import by.seven.bean.User;
import by.seven.exception.UserValidationException;
import by.seven.service.UserValidationService;

public class UserValidationDemo {
    public static void main(String[] args) throws UserValidationException {

        UserValidationService userValidationService = new UserValidationService();
        userValidationService.validate(new User("Alex", "Savenya", 21));
        userValidationService.validate(new User("A", "Seven", 21));
    }
}
