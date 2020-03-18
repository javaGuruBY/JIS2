package by.alhr;

import by.alhr.bean.Circle;
import by.alhr.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        CircleService circleService = new CircleService();
        System.out.println(circleService.calculateArea(circle1));
    }
}
