package by.serg;

import by.serg.bean.*;

public class AnimalsDemo {
    public static void main(String[] args) {
        Animal dolphin = new Mammal("Grey", "Bettie", 3, 80, false, true);
        dolphin.eat("Fish");
        dolphin.voice();
        Animal unique = new Animal();
        unique.voice();
        unique.eat("Something");
        Animal birdie = new Bird();
        birdie.eat("Seeds");
        birdie.voice();
        Parrot parrot = new Parrot();
        parrot.voice();
        parrot.eat();
        parrot.talk("WTF?");
        Animal cat = new Cat();
        cat.voice();
        Animal dog = new Dog();
        dog.voice();
    }
}
