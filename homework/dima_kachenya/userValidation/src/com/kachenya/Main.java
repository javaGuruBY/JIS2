package com.kachenya;

import com.kachenya.service.UserService;
import com.kachenya.user.User;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService(new User("dima","kachenya",19));
        userService.validUser();
    }
}
