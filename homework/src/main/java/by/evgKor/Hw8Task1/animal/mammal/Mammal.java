package by.evgKor.Hw8Task1.animal.mammal;

import by.evgKor.Hw8Task1.animal.Animal;

import java.util.Objects;

public abstract class Mammal extends Animal {
    protected boolean isFeedsMilk;
    protected int numOfPaws;
    protected int numberOfNipples;

    public Mammal(){
    }

    public Mammal(String name, boolean isFeedsMilk, int numOfPaws, int numberOfNipples) {
        super(name);
        this.isFeedsMilk = isFeedsMilk;
        this.numOfPaws = numOfPaws;
        this.numberOfNipples = numberOfNipples;
    }

    public boolean isFeedsMilk() {
        return isFeedsMilk;
    }

    public void setFeedsMilk(boolean feedsMilk) {
        isFeedsMilk = feedsMilk;
    }

    public int getNumOfPaws() {
        return numOfPaws;
    }

    public void setNumOfPaws(int numOfPaws) {
        this.numOfPaws = numOfPaws;
    }

    public int getNumberOfNipples() {
        return numberOfNipples;
    }

    public void setNumberOfNipples(int numberOfNipples) {
        this.numberOfNipples = numberOfNipples;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return isFeedsMilk == mammal.isFeedsMilk &&
                numOfPaws == mammal.numOfPaws &&
                numberOfNipples == mammal.numberOfNipples;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFeedsMilk, numOfPaws, numberOfNipples);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "isFeedsMilk=" + isFeedsMilk +
                ", numOfPaws=" + numOfPaws +
                ", numberOfNipples=" + numberOfNipples +
                ", name='" + name + '\'' +
                '}';
    }
}
