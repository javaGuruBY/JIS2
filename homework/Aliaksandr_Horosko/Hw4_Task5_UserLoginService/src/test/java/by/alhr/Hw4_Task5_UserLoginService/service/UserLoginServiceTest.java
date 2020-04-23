package by.alhr.Hw4_Task5_UserLoginService.service;

import by.alhr.Hw4_Task5_UserLoginService.bean.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserLoginServiceTest {

    @Test
   public void login() {
        UserLoginService service = new UserLoginService();
        User user = new User("Aliaksandr", "123");
        boolean expected = false;
        boolean actual = service.login(user,"3123");    // ввел неправильно
        assertEquals(expected, actual);

        boolean expected1 = false;
        boolean actual1 = service.login(user,"1234");    // ввел неправильно
        assertEquals(expected1, actual1);

        boolean expected2 = true;
        boolean actual2 = service.login(user,"123");    // ввел правильно, попытки обнулились,
        assertEquals(expected2, actual2);                         // пароль дал тру


        User user1 = new User("Aliaksandr", "123");
        boolean expected3 = false;
        boolean actual3 = service.login(user,"3123");       // ввел неправильно
        assertEquals(expected3, actual3);

        boolean expected4 = false;
        boolean actual4 = service.login(user,"1234");    // ввел неправильно
        assertEquals(expected4, actual4);

        boolean expected5 = false;
        boolean actual5 = service.login(user,"1235");    // ввел неправильно, попытки закончились,
        assertEquals(expected5, actual5);                          // пользователь заблокирован

        boolean expected6 = false;
        boolean actual6 = service.login(user,"123");    //  ввел правильно, заблокирован
        assertEquals(expected6, actual6);
    }
}