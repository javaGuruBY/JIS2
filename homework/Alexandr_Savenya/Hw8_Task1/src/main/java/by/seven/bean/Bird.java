package by.seven.bean;


import java.util.Objects;

public class Bird extends Animal {
   protected boolean fly;

    public Bird() {
    }

    public Bird(boolean fly) {
        this.fly = fly;
    }

    public Bird(int weight, String name, int age, boolean fly) {
        super(weight, name, age);
        this.fly = fly;
    }

    public boolean isFly(boolean fly) {
        return fly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return fly == bird.fly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fly);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "fly=" + fly +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
