package acya.ki.bean;

import java.util.Objects;

public class Mammal extends Animal {
    protected String color;
    protected String size;

    public Mammal(String name, int age, String color, String size) {
        super(name, age);
        this.color = color;
        this.size = size;
    }

    public Mammal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(color, mammal.color) &&
                Objects.equals(size, mammal.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, size);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
