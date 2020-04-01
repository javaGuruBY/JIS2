package by.serg.bean;

import by.serg.interfaces.Shape;

public abstract class AbstractShape implements Shape {
    protected String name;
    protected double area;

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    public AbstractShape(String name) {
        this.name = name;
    }
}
