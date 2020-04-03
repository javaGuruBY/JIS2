package by.evgKor;

import by.evgKor.bean.Dog;
import by.evgKor.service.DogService;

public class App {
    public static void main(String[] args) {
        Dog dog=new Dog(20,"black","bars");
        System.out.println("hello, my name is "+dog.getName()+
                " I'm "+dog.getAge()+" years old "+" I'm a "
                +dog.getColor()+" color");
        DogService dogService=new DogService();
        dogService.eat(dog);
        dogService.sleep(dog);
        dogService.voice(dog);


    }
}
