package by.seven;

import by.seven.bean.Cat;
import by.seven.bean.Dog;
import by.seven.bean.Parrot;

public class AnimalsDemo {
    public static void main(String[] args) {
        Parrot parrot = new Parrot(13, "Govorun", 5, true );
        parrot.eat();
        parrot.voice();
        Cat cat = new Cat(23, "Moss", 1, "Gray", true);
        cat.eat();
        cat.voice();
        Dog dog = new Dog(120, "Deathmachine", 7, "Black", false);
        dog.eat();
        dog.voice();
    }
}
