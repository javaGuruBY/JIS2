package by.alhr.Hw8_Task1_Animals.service;

import java.util.Objects;

public class Cat extends Mammal {
    private String name;
    public Cat(String view, String eat, String name) {
        super(view, eat);
        this.name = name;
    }
    public void newName (String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public String toString() {
        return "Cat: " +
                "My name is = " + name +
                ", I like eat = " + eat +
                ", My view = " + view + "!!!";
    }
}
