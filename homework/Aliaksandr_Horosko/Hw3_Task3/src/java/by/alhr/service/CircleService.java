package by.alhr.service;

import by.alhr.bean.Circle;

public class CircleService {
    public void calculateArea(Circle circle) {
        System.out.println(Math.PI*circle.getRadius()*circle.getRadius());
    }
}
