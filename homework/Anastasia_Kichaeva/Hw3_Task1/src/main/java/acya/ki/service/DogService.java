package acya.ki.service;

import acya.ki.bean.Dog;

public class DogService {
    private Dog dog;

    public DogService() {

    }
    public DogService(int age, String name, String color){
        dog.setAge(age);
        dog.setColor(color);
        dog.setName(name);
    }

    public Dog getDog(){
        return dog;
    }

    public void setDog(Dog dog){
        this.dog = dog;
    }

    public void voice(Dog dog){
        System.out.println("Bark-Bark! My name is " + dog.getName());
    }
    public void eat(Dog dog) {
        if (dog.getName() == "Grisha") {
            System.out.println("I want to eat");
        } else System.out.println("I'm full");
    }

    public void sleep(Dog dog){
        if (dog.getAge() >= 10){
            System.out.println("I want to sleep!");
        } else System.out.println("Let's play!");

    }

}
