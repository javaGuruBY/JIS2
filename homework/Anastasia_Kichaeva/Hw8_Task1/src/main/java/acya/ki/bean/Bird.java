package acya.ki.bean;

import java.util.Objects;

public class Bird extends Animal {

    protected boolean fly;
    protected boolean swim;

    public Bird(String name, int age, boolean fly, boolean swim) {
        super(name, age);
        this.fly = fly;
        this.swim = swim;
    }

    public Bird() {
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return fly == bird.fly &&
                swim == bird.swim;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fly, swim);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "fly=" + fly +
                ", swim=" + swim +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        if(isFly() && isSwim()){
            System.out.println("Kurlik-kurlik, my name is " + name + ", I like to eat fish and different flying bugs!");
        } else if(isSwim()){
            System.out.println("Kurlik-kurlik, my name is " + name + ", I'm " + age + " years old, I love swim slowly and eat FISH, numerous FIIIISH!!!");
        } else {
            System.out.println("Kurlik-kurlik, my name is " + name + ". I like to eat small flying bugs and worms!");
        }
    }
}
