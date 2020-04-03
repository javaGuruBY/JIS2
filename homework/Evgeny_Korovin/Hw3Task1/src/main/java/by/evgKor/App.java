package by.evgKor;

import by.evgKor.bean.Dog;
import by.evgKor.service.DogService;

public class App {
    public static void main(String[] args) {
        Dog dogNumOne=new Dog(20,"black","bars");
        System.out.println("hello, my name is "+dogNumOne.getName()+" I'm "+dogNumOne.getAge()+" years old "+" I'm a "+dogNumOne.getColor()+" color");
        DogService dogService=new DogService();
        dogService.eat();
        dogService.sleep(dogNumOne);
        dogService.voice();


    }
}
