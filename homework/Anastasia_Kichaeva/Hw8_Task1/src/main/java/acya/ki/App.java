package acya.ki;

import acya.ki.bean.Bird;
import acya.ki.bean.Cat;
import acya.ki.bean.Dog;
import acya.ki.bean.Parrot;

public class App {
    public static void main(String[] args) {
        Bird birdOne = new Bird("Kesha", 18, true, false);
        birdOne.eat();
        System.out.println("- - - - -");
        Bird birdTwo = new Bird("Alex", 40, false, true);
        birdTwo.eat();
        System.out.println("- - - - -");
        Parrot parrot = new Parrot("Adolf", 35, true, true);
        parrot.eat();
        parrot.voice();
        System.out.println("- - - - -");
        Cat cat = new Cat("Vasya", 4, "brown", "very big", 0);
        cat.eat();
        cat.voice();
        cat.fellOutOfTheWindow();
        cat.setFellOut(4);
        cat.fellOutOfTheWindow();
        cat.setFellOut(5);
        cat.fellOutOfTheWindow();
        System.out.println("- - - - -");
        Dog dog = new Dog("Genry", 14, "orange", "very big");
        dog.eat();
        dog.voice();
    }
}
