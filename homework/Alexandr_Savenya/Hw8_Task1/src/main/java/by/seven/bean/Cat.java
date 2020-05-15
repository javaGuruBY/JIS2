package by.seven.bean;

public class Cat extends Mammal {

    public Cat() {
    }

    public Cat(int weight, String name, int age, String color, boolean run) {
        super(weight, name, age, color, run);
    }

    @Override
    public void eat() {
       if (run) {
           System.out.println("Cat eat: No time to eat!!!");
       } else {
           System.out.println("Cat eat: I'm eat chicken)");
       }
    }

    @Override
    public void voice() {
        if (run) {
            System.out.println("Cat voice: meow meow");
        } else {
            System.out.println("Cat voice: Murrrrr.....");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", run=" + run +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
