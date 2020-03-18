package by.alhr.bean;

import java.util.Objects;

public class Dog {
    private int Age;
    private String color;
    private String name;

    public Dog() {
    }

    public Dog(int age, String color, String name) {
        Age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Age == dog.Age &&
                Objects.equals(color, dog.color) &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Age, color, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Age=" + Age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
