package by.evgKor.Hw8Task1.animal.bird;

import by.evgKor.Hw8Task1.animal.Animal;

import java.util.Objects;

public class Bird extends Animal {
    protected int size;

    public Bird() {
    }

    public Bird(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return size == bird.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
