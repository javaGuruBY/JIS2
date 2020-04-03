package by.lukash.animals.bean;

import java.util.Objects;

public class Mammal extends Animal {
    protected int numberOfLegs;
    public Mammal (String name, int age, int numberOfLegs){
        super(name, age);
        this.numberOfLegs = numberOfLegs;
    }

    public Mammal() {
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return numberOfLegs == mammal.numberOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfLegs);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "numberOfLegs=" + numberOfLegs +
                '}';
    }
}
