package by.evgKor.Hw8Task1.animal.mammal.cat;

import by.evgKor.Hw8Task1.animal.mammal.Mammal;

public class Cat extends Mammal {

    public Cat(){}

    public Cat(String name, boolean isFeedsMilk, int numOfPaws, int numberOfNipples) {
        super(name, isFeedsMilk, numOfPaws, numberOfNipples);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "is Feeds Milk=" + isFeedsMilk +
                ", num Of Paws=" + numOfPaws +
                ", number Of Nipples=" + numberOfNipples +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Hi, my name is "+name+" I want to eat, niam-niam");
    }
}
