package by.alhr.Hw8_Task2_Shape.service;

import by.alhr.Hw8_Task2_Shape.bean.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(){
    }

    @Override
    public double getArea() {
        double circleArea = Math.PI * (radius * radius);
        return circleArea;
    }
}
