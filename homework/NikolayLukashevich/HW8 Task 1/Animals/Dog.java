package by.lukash.animals.bean;

public class Dog extends Mammal {
    public void voice (){
        System.out.println("Woof-woof, my name is " + name+ ", i'm "+age+ " year's old, and i steel have "+ numberOfLegs + " legs:)");;
    }
    public Dog (String name, int age, int numberOfLegs){
        super(name, age, numberOfLegs);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "numberOfLegs=" + numberOfLegs +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
