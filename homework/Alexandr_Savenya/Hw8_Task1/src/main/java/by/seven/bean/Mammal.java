package by.seven.bean;

import java.util.Objects;

public class Mammal extends Animal{
    protected String color;
    protected boolean run;

    public Mammal() {
    }

    public Mammal(int weight, String name, int age, String color, boolean run) {
        super(weight, name, age);
        this.color = color;
        this.run = run;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return run == mammal.run &&
                Objects.equals(color, mammal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, run);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", run=" + run +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
