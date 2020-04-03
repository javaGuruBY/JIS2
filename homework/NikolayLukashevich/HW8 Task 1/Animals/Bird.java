package by.lukash.animals.bean;

import java.util.Objects;

public class Bird extends Animal {

    protected boolean isFlying;

    public Bird (String name, int age, boolean isFlying){
        super(name, age);
        this.isFlying = isFlying;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return isFlying == bird.isFlying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFlying);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "isFlying=" + isFlying +
                '}';
    }
}
