package by.alhr;

import by.alhr.bean.Circle;
import by.alhr.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(25.125);
        Circle circle2 = new Circle(5.25);
        Circle circle3 = new Circle(7);

        CircleService circleService = new CircleService();
        circleService.calculateArea(circle);
        circleService.calculateArea(circle2);
        circleService.calculateArea(circle3);
    }
}
