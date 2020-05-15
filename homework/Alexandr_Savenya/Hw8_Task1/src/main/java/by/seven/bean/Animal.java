package by.seven.bean;

import java.util.Objects;

public class Animal {
    protected int weight;
    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(int weight, String name, int age) {
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat() {
    }
    public void voice() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight &&
                age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}





