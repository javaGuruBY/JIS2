package by.alhr.Hw8_Task1_Animals.service;

import java.util.Objects;

public class Dog extends Mammal {
    private String name;

    public Dog(String view, String eat, String name) {
        super(view, eat);
        this.name = name;
    }

    public void newName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public String toString() {
        return "Dog: " +
                "My name is = " + name +
                ", I like eat = " + eat +
                ", My view = " + view + "!!!";
    }
}
