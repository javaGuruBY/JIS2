package by.serg.bean;

import java.util.Objects;

public class Bird extends Animal {
    protected boolean canFly;

    public void layAnEgg() {
        System.out.println("What a strange egg. Which bird could lay it?");
    }

    public void eat(String food) {
        System.out.println("I hope these are seeds");
    }

    public void voice() {
        System.out.println("Shouldn't birds sing?");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return canFly == bird.canFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canFly);
    }

    public Bird() {
    }

    public Bird(String color, String name, int age, int weight, boolean canFly) {
        super(color, name, age, weight);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
