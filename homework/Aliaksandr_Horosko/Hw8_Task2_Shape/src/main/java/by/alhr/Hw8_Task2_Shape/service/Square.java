package by.alhr.Hw8_Task2_Shape.service;

import by.alhr.Hw8_Task2_Shape.bean.AbstractShape;

public class Square extends AbstractShape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        double squareArea = side * side;
        return squareArea;
    }
}
