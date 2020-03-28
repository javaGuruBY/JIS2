package com.kachenay.animal.animalChild.mammalChild;

import com.kachenay.animal.animalChild.Mammal;

public class Cat extends Mammal {
    public Cat() {
    }

    public Cat(String name, int collOfTeat, boolean isHomeAnimal, String kind) {
        super(name, collOfTeat, isHomeAnimal, kind);
    }

    @Override
    public void voice() {
        System.out.println("Hello mafaka, i am mister Cat.And my name is"+ name);
    }
}
