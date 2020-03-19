package by.jrr.jistwo.service;

import by.jrr.jistwo.bean.User;

public class UserService implements Runnable{

    @Override
    public void run() {
        String firstNumber = new String("something");
        System.out.println(MyUtilities.mimicObjectToString(firstNumber));
        firstNumber.replace("something", "another");
        System.out.println(MyUtilities.mimicObjectToString(firstNumber));
        System.out.println(MyUtilities.mimicObjectToString(firstNumber));
        User user = new User("Vova", 26);
        System.out.println(MyUtilities.mimicObjectToString(user));
        user.setName("Zanova");
        System.out.println(MyUtilities.mimicObjectToString(user));


    }
}
