package by.alhr.hw2task4.bean;

import java.util.Objects;

public class RandomGenerator {
    public RandomGenerator() {
        return;
    }

    @Override
    public String toString() {
        return "RandomGenerator{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomGenerator that = (RandomGenerator) o;
        return Double.compare(that.a, a) == 0 &&
                Double.compare(that.b, b) == 0 &&
                Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public RandomGenerator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double a = Math.random() * 3;
    double b = Math.random() * 8;
    double c = Math.random() * 12;
    public double aDouble (){
        return a;
    }
    public double bDouble (){
        return b;
    }
    public double cDouble (){
        return c;
    }
    public double Random (){
        return a + b + c;
    }

}
