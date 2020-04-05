package by.alhr.service;

import by.alhr.bean.Circle;

public class CircleService {
    double area;

    public void calculateArea(Circle circle) {
        area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println(area);

    }
}
