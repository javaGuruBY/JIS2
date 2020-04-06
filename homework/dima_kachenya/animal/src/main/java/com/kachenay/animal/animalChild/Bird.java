package com.kachenay.animal.animalChild;

import com.kachenay.animal.Animal;

import java.util.Objects;

public abstract class Bird extends Animal {
    private String kind;

    public Bird(){}
    public Bird(String name, String kind) {
        super(name);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(kind, bird.kind)&&super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kind);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
