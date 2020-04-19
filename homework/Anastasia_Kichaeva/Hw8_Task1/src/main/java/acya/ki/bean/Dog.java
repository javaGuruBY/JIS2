package acya.ki.bean;

public class Dog extends Mammal {
    public Dog(String name, int age, String color, String size) {
        super(name, age, color, size);
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Gaf, my name is " + name + ", I'm " + size + " dog, and i adore eat meat!");
    }

    @Override
    public void voice() {
        System.out.println("Gaf-Gaf! Why I'm " + color + "??? Gaf-Gaf!!!");
    }
}
