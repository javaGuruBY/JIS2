package by.evgKor.Hw8Task1.animal.mammal.dog;

import by.evgKor.Hw8Task1.animal.mammal.Mammal;

public class Dog extends Mammal {
    public Dog(){}
    public Dog(String name, boolean isFeedsMilk, int numOfPaws, int numberOfNipples) {
        super(name, isFeedsMilk, numOfPaws, numberOfNipples);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "is Feeds Milk=" + isFeedsMilk +
                ", num Of Paws=" + numOfPaws +
                ", number Of Nipples=" + numberOfNipples +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Waaaf-Waaaf, my name is "+name+" go away, I'm eating");
    }
}

