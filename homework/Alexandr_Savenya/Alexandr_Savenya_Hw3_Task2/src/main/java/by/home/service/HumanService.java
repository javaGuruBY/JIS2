package by.home.service;

import by.home.bean.Human;

public class HumanService {
    public void greet(Human human) {
        System.out.println("Hi! My name is " + human.getName() + ". I'm " + human.getAge() + " years old. " );
    }
}
