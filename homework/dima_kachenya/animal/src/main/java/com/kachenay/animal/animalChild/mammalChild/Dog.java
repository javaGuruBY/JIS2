package com.kachenay.animal.animalChild.mammalChild;

import com.kachenay.animal.animalChild.Mammal;

public class Dog extends Mammal {
    public Dog() {
    }

    public Dog(String name, int collOfTeat, boolean isHomeAnimal, String kind) {
        super(name, collOfTeat, isHomeAnimal, kind);
    }

    @Override
    public void voice() {
        System.out.println("Gaf-gaf mafacka");
    }
}
