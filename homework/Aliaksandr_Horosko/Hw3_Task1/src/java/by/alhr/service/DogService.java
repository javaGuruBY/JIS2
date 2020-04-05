package by.alhr.service;

import by.alhr.bean.Dog;

public class DogService {
    public DogService() {
    }

    public void voice(Dog dog) {
        System.out.println("She sad: Gaff-Gaff");
    }

    public void eat(Dog dog) {
        System.out.println("I like eat");
    }

    public void sleep(Dog dog) {
        System.out.println("I want sleep");
    }
}
