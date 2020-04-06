package com.kachenay;

import com.kachenay.animal.animalChild.birdChild.Parrot;
import com.kachenay.animal.animalChild.mammalChild.Cat;
import com.kachenay.animal.animalChild.mammalChild.Dog;

public class Main {
    public static void main(String[] args) {
        Parrot gosha=new Parrot("Gosha","Parrot");
        Dog sharik=new Dog("Sharik",6,true,"dog");
        Cat kukki=new Cat("Kukki",6,true,"Cat");
        gosha.voice();
        System.out.println(gosha);
        sharik.voice();
        System.out.println(sharik);
        kukki.voice();
        System.out.println(kukki);
    }
}
