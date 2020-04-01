package by.serg.bean;

import java.util.Objects;

public class Dog extends Mammal {
    private String breed;
    private boolean pet = true;

    public void eat(String food) {
        System.out.println("Whatta good boi! Givem a bone!");
    }

    public void voice() {
        System.out.println("Bark-Bark!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return pet == dog.pet &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, pet);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", pet=" + pet +
                ", isPregnant=" + isPregnant +
                ", pet=" + pet +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Dog() {
    }

    public Dog(String color, String name, int age, int weight, boolean isPregnant, boolean pet, String breed, boolean pet1) {
        super(color, name, age, weight, isPregnant, pet);
        this.breed = breed;
        this.pet = pet1;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean isPet() {
        return pet;
    }


}
