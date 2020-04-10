package by.evgKor;

import by.evgKor.bean.User;
import by.evgKor.exception.UserValidationException;
import by.evgKor.service.UserValidationService;

public class Main {
    public static void main(String[] args) throws UserValidationException {
        UserValidationService userValidationService=new UserValidationService();
        userValidationService.validate(new User("Evgeny","Korovin",22));
        userValidationService.validate(new User("Un","Choy",50));
    }
}
