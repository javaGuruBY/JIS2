package by.evgKor.service;
import by.evgKor.bean.Human;
public class HumanService {
    public void greet(Human human) {
        System.out.println("Hello, my name is " + human.getName() + " I'm " + human.getAge() + " years old");
        if (human.getAge() > 50) {
            System.out.println("I'm old person");
        } else if (human.getAge() < 20) {
            System.out.println("I am a teenager");
        } else {
            System.out.println("I'm an adult person");
        }

    }


}