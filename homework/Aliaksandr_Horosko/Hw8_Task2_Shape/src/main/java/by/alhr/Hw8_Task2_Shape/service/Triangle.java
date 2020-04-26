package by.alhr.Hw8_Task2_Shape.service;

import by.alhr.Hw8_Task2_Shape.bean.AbstractShape;

public class Triangle extends AbstractShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double sidePp = (sideA + sideB + sideC)/2;
        double triangleArea = Math.sqrt(sidePp * (sidePp-sideA) * (sidePp - sideB) * (sidePp - sideC));
        return triangleArea;
    }
}
