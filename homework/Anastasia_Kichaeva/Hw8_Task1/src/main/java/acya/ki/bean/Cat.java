package acya.ki.bean;

import java.util.Objects;

public class Cat extends Mammal {
    private int fellOut;
    private int lives;

    public Cat(String name, int age, String color, String size, int fellOut) {
        super(name, age, color, size);
        this.fellOut = fellOut;
        this.lives = 9;
    }

    public Cat(){
    }

    public int getFellOut() {
        return fellOut;
    }

    public void setFellOut(int fellOut) {
        this.fellOut = fellOut;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return fellOut == cat.fellOut &&
                lives == cat.lives;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fellOut, lives);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "fellOut=" + fellOut +
                ", lives=" + lives +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("May-may, my name is " + name + ", I'm " + age + " years old, and i like eat fish, meat and ice-cream!");
    }

    @Override
    public void voice() {
        System.out.println("May-may-may! I'm " + size + " cat! May-may-may");
    }
    public void fellOutOfTheWindow(){
        if(fellOut > 0 && lives - fellOut > 0){
            lives = lives - fellOut;
            System.out.println("OMG, I have just " + lives + " lives now...Henceforth I will be more careful!");
        } else if(lives - fellOut <= 0){
            System.out.println("Cat " + name + " RIP!");
        } else {
            System.out.println("What a clever cat i am!");
        }
    }
}
