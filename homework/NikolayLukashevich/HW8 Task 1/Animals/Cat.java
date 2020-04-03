package by.lukash.animals.bean;

public class Cat extends Mammal {
    public void voice (){
    }
    public Cat (String name, int age, int numberOfLegs){
        super(name, age, numberOfLegs);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfLegs=" + numberOfLegs +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
