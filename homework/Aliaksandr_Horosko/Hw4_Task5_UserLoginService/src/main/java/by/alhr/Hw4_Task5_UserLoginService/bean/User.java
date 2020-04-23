package by.alhr.Hw4_Task5_UserLoginService.bean;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String password;
    private boolean isTheUserBlocked;
    private int theNumberOfAttempts;

    public void resetNumberOfTriesToLogin() {
        theNumberOfAttempts = 0;
    }

    public void maximumNumberOfAttempts() {
        theNumberOfAttempts++;
        if (theNumberOfAttempts >= 3) {
            isTheUserBlocked = true;
        }
    }

    public String getUsersPassword(User name) {
        return password;
    }

     public boolean isBlocked(User name) {
        return isTheUserBlocked;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

