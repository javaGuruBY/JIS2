package by.serg.service;

import by.serg.bean.User;
import by.serg.exceptions.UserValidationException;

public class UserValidationService {

    public void validate(User user) throws UserValidationException {
         if(!isUsersAgeIsCorrect(user)) {
             throw new UserValidationException("Age must be from 0 to 120");
         } else if(!isUsersFirstNameIsCorrect(user)) {
             throw new UserValidationException("Length of first name must be from 3 to 15 symbols");
         } else if(!isUsersLastNameIsCorrect(user)) {
             throw new UserValidationException("Length of last name must be from 3 to 15 symbols");
         }
        System.out.println("Validation succeed");
    }

    private boolean isUsersFirstNameIsCorrect(User user) {
        if(user.getFirstName().length() >= 3 && user.getFirstName().length() <= 15) {
            return true;
        }
        return false;
    }

    private boolean isUsersLastNameIsCorrect(User user) {
        if(user.getLastName().length() >= 3 && user.getLastName().length() <= 15) {
            return true;
        }
        return false;
    }

    private boolean isUsersAgeIsCorrect(User user) {
        if(user.getAge() >= 0 && user.getAge() <= 120) {
            return true;
        }
        return false;
    }
}
