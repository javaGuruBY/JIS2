package com.kachenay.animal.animalChild;

import com.kachenay.animal.Animal;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private int collOfTeat;
    private boolean isHomeAnimal;
    private String kind;
    public Mammal(){}
    public Mammal(String name, int collOfTeat, boolean isHomeAnimal,String kind) {
        super(name);
        this.collOfTeat = collOfTeat;
        this.isHomeAnimal = isHomeAnimal;
        this.kind=kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getCollOfTeat() {
        return collOfTeat;
    }

    public void setCollOfTeat(int collOfTeat) {
        this.collOfTeat = collOfTeat;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return collOfTeat == mammal.collOfTeat &&
                isHomeAnimal == mammal.isHomeAnimal&& super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collOfTeat, isHomeAnimal);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "collOfTeat=" + collOfTeat +
                ", isHomeAnimal=" + isHomeAnimal +
                ", name='" + name + '\'' +
                ", kind='"+kind+'\''+
                '}';
    }
}
