package by.serg.service;

import by.serg.bean.Circle;

public class CircleService {
    public double calculateArea(Circle circle) {
        return Math.pow(circle.getRadius(), 2)*Math.PI;
    }
}
