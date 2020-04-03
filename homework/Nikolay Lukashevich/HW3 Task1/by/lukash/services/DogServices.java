package by.lukash.services;
import by.lukash.bean.Dog;

public class DogServices {

        public void voice(Dog firstDog) {
        System.out.println("Woof-Woof");
    }
    public void eat(Dog firstDog) {
        System.out.println("I want eat");
    }
    public void sleep(Dog firstDog) {
        if(firstDog.getAge()>=12){
            System.out.println("I want to sleep");
        }else {
            System.out.println("Wat you want?");
        }

    }
}
