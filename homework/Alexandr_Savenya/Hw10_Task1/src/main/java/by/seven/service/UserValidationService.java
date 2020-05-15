package by.seven.service;

import by.seven.bean.User;
import by.seven.exception.UserValidationException;

public class UserValidationService {

    public void validate(User user) throws UserValidationException {

        if (!isUserFirstNameIsCorrect(user)) {
            throw new UserValidationException("Number of characters: 3 - 15");
        } else if (!isUserLastNameIsCorrect(user)) {
            throw new UserValidationException("Number of characters: 3 - 15");
        } else if (isUserAgeIsCorrect(user)) {
            throw  new UserValidationException("Age must be from 0 to 120");
        }
        System.out.println(user);
    }

    private boolean isUserFirstNameIsCorrect(User user) {
        if(user.getFirstName().length() >= 3 && user.getFirstName().length() <= 15) {
            return true;
        }
        return false;
    }

    private boolean isUserLastNameIsCorrect(User user) {
        if(user.getLastName().length() >= 3 && user.getLastName().length() <= 15) {
            return true;
        }
        return false;
    }

    private boolean isUserAgeIsCorrect(User user) {
        if(user.getAge() >= 0 && user.getAge() <= 120) {
            return true;
        }
        return false;
    }

}



