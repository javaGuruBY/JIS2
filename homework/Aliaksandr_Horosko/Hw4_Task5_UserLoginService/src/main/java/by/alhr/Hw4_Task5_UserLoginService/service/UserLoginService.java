package by.alhr.Hw4_Task5_UserLoginService.service;

import by.alhr.Hw4_Task5_UserLoginService.bean.User;

public class UserLoginService implements Runnable {
    boolean login(User user, String password) {
        if (user.isBlocked(user)) {
            System.out.println("Login error: this user is blocked");
            return false;
        } else {
            if (password.equals(user.getUsersPassword(user))) {
                user.resetNumberOfTriesToLogin();
                return true;
            } else {
                user.maximumNumberOfAttempts();
            }
        }
        return false;
    }

    @Override
    public void run() {
        UserLoginService service = new UserLoginService();
        User user1 = new User("Aliaksandr", "Dal239");
        System.out.println(service.login(user1, "al239 "));
        System.out.println(service.login(user1, "Dal2399"));
        System.out.println(service.login(user1, "Dal239g"));

        System.out.println(service.login(user1, "Dal239"));
    }
}
