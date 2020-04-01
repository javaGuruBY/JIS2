package by.serg.bean;

import java.util.Objects;

public class Cat extends Mammal {
    private String breed;
    private boolean pet = true;

    public void eat(String food) {
        System.out.println("KITEKAT!!!");
    }

    public void voice() {
        System.out.println("MEOOOOOOW");
    }

    public Cat() {
    }

    public Cat(String color, String name, int age, int weight, boolean isPregnant, boolean pet, String breed) {
        super(color, name, age, weight, isPregnant, pet);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean isPet() {
        return pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return pet == cat.pet &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, pet);
    }

    @Override
    public String toString() {
        return "Cat{" +
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
}
