package by.home;

import by.home.bean.Circle;
import by.home.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        CircleService circleService = new CircleService();
        System.out.println(circleService.calculateArea(circle1));
    }
}
