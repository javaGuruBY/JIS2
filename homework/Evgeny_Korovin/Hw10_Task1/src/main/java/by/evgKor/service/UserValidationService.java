package by.evgKor.service;

import by.evgKor.bean.User;
import by.evgKor.exception.UserValidationException;

public class UserValidationService {

    public void validate(User user) throws UserValidationException {

        if (!(user.getFirstName().length() >= 3) && !(user.getFirstName().length() >= 15)) {
            throw new UserValidationException("name should be from 3 to 15 symbols");
        } else if (!(user.getLastName().length() >= 3) && !(user.getLastName().length() >= 15)) {
            throw new UserValidationException("last name should be from 3 to 15 symbols");
        } else if (!(user.getAge() < 120) && !(user.getAge() == 0)) {
            throw new UserValidationException("age should be from 0 to 120");
        }
        System.out.println(user.toString());
    }

}



