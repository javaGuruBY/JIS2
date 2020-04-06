package by.lukash.Shape.bean;

import by.lukash.Shape.Interfaces.Shape;

public abstract class AbstractShape implements Shape {
    protected String name;
    protected double area;
    protected String color;

    public String getName() {
        return this.name;
    }


    public String getColor() {
        return color;
    }
    public AbstractShape(String name) {
        this.name = name;
    }
    public AbstractShape(String name, String color) {
        this.name = name;
        this.color = color;
    }


}



