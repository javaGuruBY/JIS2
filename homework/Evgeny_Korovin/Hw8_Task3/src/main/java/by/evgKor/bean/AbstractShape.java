package by.evgKor.bean;

import by.evgKor.Shape;

import java.util.Objects;

public class AbstractShape implements Shape {

    private String name;
    private double area;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }

    public AbstractShape(String name) {
        this.name = name;
    }
}
