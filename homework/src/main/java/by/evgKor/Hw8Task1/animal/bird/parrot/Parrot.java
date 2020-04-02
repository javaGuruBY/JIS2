package by.evgKor.Hw8Task1.animal.bird.parrot;

import by.evgKor.Hw8Task1.animal.bird.Bird;

public class Parrot extends Bird {

    public Parrot() {
    }

    public Parrot(String name, int size) {
        super(name, size);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void sing() {
        System.out.println("My name is "+name+" la-la-la-la");
    }
}
