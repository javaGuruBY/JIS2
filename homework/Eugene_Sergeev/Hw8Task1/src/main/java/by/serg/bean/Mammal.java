package by.serg.bean;

import java.util.Objects;

public class Mammal extends Animal {
    protected boolean isPregnant;
    protected boolean pet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return isPregnant == mammal.isPregnant &&
                pet == mammal.pet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPregnant, pet);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "isPregnant=" + isPregnant +
                ", pet=" + pet +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Mammal() {
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public boolean isPet() {
        return pet;
    }

    public Mammal(String color, String name, int age, int weight, boolean isPregnant, boolean pet) {
        super(color, name, age, weight);
        this.isPregnant = isPregnant;
        this.pet = pet;
    }

    public void eat(String food) {
        System.out.println("IS THIS A MILK?");
    }

    public void voice() {
        System.out.println("What does the fox say?");
    }
}
