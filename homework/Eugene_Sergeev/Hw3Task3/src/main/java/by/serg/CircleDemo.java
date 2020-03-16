package by.serg;

import by.serg.bean.Circle;
import by.serg.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        CircleService circleService = new CircleService();
        System.out.println(circleService.calculateArea(circle1));
        circle1.setRadius(10);
        System.out.println(circleService.calculateArea(circle1));
    }
}
