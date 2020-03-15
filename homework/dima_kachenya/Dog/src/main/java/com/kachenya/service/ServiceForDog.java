package com.kachenya.service;

import com.kachenya.been.Dog;

public class ServiceForDog {
    private Dog dog;

    public ServiceForDog() {
    }

    public ServiceForDog(byte age, String color, String name) {
        dog.setAge(age);
        dog.setColor(color);
        dog.setName(name);
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void voice() {
        System.out.println(dog.getName() + " say: Gaf-Gaf");
    }

    public void eat() {
        System.out.println(dog.getName() + " eat");
    }

    public void sleep() {
        System.out.println(dog.getName() + " sleep now");
    }

}
