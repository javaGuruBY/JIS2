package by.evgKor.service;
import by.evgKor.bean.Dog;
public class DogService {
     DogService dogService;

    public void voice() {
        System.out.println("Waaaf-Waaf");
    }

    public void eat() {
        System.out.println("I'm hungry, I want eat");

    }

    public void sleep(Dog dog) {
        if(dog.getAge()>12){
            System.out.println("I'm very old, I want sleep");
        }else{
        System.out.println("I want playing with you, don't sleep");
        }

        }
    }
