package com.kachenya.service;

import com.kachenya.bean.Human;

public class ServiceForHuman {
    private Human human;

    public ServiceForHuman() {
    }

    public ServiceForHuman(Human human) {
        this.human = human;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void greet() {
        System.out.println("Hello, my name is " + human.getName() + "I am " + human.getAge() + "old");
    }
}
