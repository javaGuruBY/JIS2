package com.kachenay.animal.animalChild.birdChild;

import com.kachenay.animal.animalChild.Bird;

public class Parrot extends Bird {
    public Parrot() {
    }

    public Parrot(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void voice() {
        System.out.println("I am is parrot. my name is "+name);
    }
}
