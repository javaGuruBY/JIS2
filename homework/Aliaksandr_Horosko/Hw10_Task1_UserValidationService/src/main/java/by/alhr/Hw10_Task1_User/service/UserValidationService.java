package by.alhr.Hw10_Task1_User.service;

import by.alhr.Hw10_Task1_User.bean.User;
import by.alhr.Hw10_Task1_User.exception.UserValidationException;

public class UserValidationService {
    public void validate(User user) throws UserValidationException {
        if(!isUsersAgeIsCorrect(user)) {
            throw new UserValidationException("Допустимый возраст пользователя: от 0 до 120 лет включительно");
        } else if(!isUsersFirstNameIsCorrect(user)) {
            throw new UserValidationException("Минимальная длина имени / фамилии пользователя - 3 символа");
        } else if(!isUsersLastNameIsCorrect(user)) {
            throw new UserValidationException("Максимальная длина имени / фамилии пользователя - 15 символов");
        }
        System.out.println("Проверка пройдена");
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
