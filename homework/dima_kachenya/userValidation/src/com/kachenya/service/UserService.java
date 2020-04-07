package com.kachenya.service;

import com.kachenya.customExeption.UserValidationExeption;
import com.kachenya.user.User;

import java.net.UnknownServiceException;

public class UserService {
    User user = new User();

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void validUser() {
        if (!chekStartName()) {
            try {
                throw new UserValidationExeption("Incorate name . Lenght < 3");
            } catch (UserValidationExeption e) {
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        } else if (!checkEndName()) {
            try {
                throw new UnknownServiceException("Incorate name. Lenght more than 15");
            } catch (UnknownServiceException e) {
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        }

        if (!checkStartLastName()) {
            try {
                throw new UserValidationExeption("Incorate last name . Lenght < 3");
            } catch (UserValidationExeption e) {
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        } else if (!checkEndLastName()) {
            try {
                throw new UnknownServiceException("Incorate last name. Lenght more than 15");
            } catch (UnknownServiceException e) {
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        }

        if (!chekAge()) {
            try {
                throw new UserValidationExeption("Incorate age.");
            } catch (UserValidationExeption e) {
                System.out.println(e.getMessage());
                e.getStackTrace();
            }
        }
    }

    private boolean chekAge() {
        if (user.getAge() > 0 && user.getAge() < 120) {

            return true;
        }

        return false;
    }

    private boolean chekStartName() {
        if (user.getFirstName().length() > 3) {

            return true;
        }

        return false;
    }

    private boolean checkEndName() {
        if (user.getFirstName().length() < 15) {

            return true;
        }

        return false;
    }

    private boolean checkStartLastName() {
        if (user.getLastName().length() > 3) {

            return true;
        }

        return false;
    }

    private boolean checkEndLastName() {
        if (user.getLastName().length() < 15) {

            return true;
        }

        return false;
    }
}
