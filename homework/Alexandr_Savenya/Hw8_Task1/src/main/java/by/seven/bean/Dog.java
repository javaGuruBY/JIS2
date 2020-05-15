package by.seven.bean;

public class Dog extends Mammal {

    public Dog() {
    }

    public Dog(int weight, String name, int age, String color, boolean run) {
        super(weight, name, age, color, run);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", run=" + run +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        if (run) {
            System.out.println("Dog eat: I AM RUN !!!");
        } else {
            System.out.println("Dog eat: I'm eat feed");
        }
    }

    @Override
    public void voice() {
        if (run) {
            System.out.println("Dog voice: WOOOOOF!!! WOOOOF!!!");
        } else {
            System.out.println("Dog voice: Woof woof");
        }
    }
}
