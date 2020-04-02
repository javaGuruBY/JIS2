package by.serg.service;

import by.serg.bean.Dog;

public class DogService {

    public void voice(Dog dog) {
        System.out.println("Bark-bark");
    }

    public void eat(Dog dog) {
        System.out.println("The dog is fed");
    }

    public void sleep(Dog dog) {
        System.out.println("The dog fell asleep");
    }

    public DogService() {
    }
}
