package by.lukash.animals.bean;

import java.util.Objects;

public class Parrot extends Bird {
    protected int id;
    public Parrot(String name, int age, boolean isFlying, int id) {
        super(name, age, isFlying);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return id == parrot.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "id=" + id +
                ", isFlying=" + isFlying +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
