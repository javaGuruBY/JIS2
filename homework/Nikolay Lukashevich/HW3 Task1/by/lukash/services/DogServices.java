package by.lukash.services;
import by.lukash.bean.Dog;

public class DogServices {
    DogServices dogServices;

    public void voice() {
        System.out.println("Woof-Woof");
    }
    public void eat() {
        System.out.println("I want eat");
    }
    public void sleep(Dog dog) {
        if(Dog.getAge()>=12){
            System.out.println("I want to sleep");
        }else {
            System.out.println("Wat you want?");
        }

    }
}
