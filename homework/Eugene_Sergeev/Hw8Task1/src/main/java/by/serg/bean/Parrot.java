package by.serg.bean;

import java.util.Objects;

public class Parrot extends Bird {
    protected boolean canFly = true;

    public void voice() {
        System.out.println("Parrot says \"Karrrrambaaa\"");
    }

    public void eat() {
        System.out.println("Parrot eats seeds and vegetables");
    }

    public void talk(String phrase) {
        System.out.println("Parrot goes - " + phrase);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return canFly == parrot.canFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canFly);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "canFly=" + canFly +
                ", canFly=" + canFly +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Parrot() {
    }

    public Parrot(String color, String name, int age, int weight, boolean canFly, boolean canFly1) {
        super(color, name, age, weight, canFly);
        this.canFly = canFly1;
    }

    @Override
    public boolean isCanFly() {
        return canFly;
    }
}
