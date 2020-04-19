package by.serg.bean;

import java.util.Objects;

public class Animal {

    protected String color;
    protected String name;
    protected int age;
    protected int weight;

    public void eat(String food) {
        System.out.println("You really wanna feed " + food + " to this animal?");
    }

    public void voice() {
        System.out.println("What does this animal say?");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                weight == animal.weight &&
                Objects.equals(color, animal.color) &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, age, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Animal() {
    }

    public Animal(String color, String name, int age, int weight) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }


}
