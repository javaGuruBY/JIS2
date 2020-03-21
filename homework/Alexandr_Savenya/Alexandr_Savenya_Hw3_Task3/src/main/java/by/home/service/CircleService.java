package by.home.service;

import by.home.bean.Circle;

public class CircleService {
    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
