package by.alhr;

import by.alhr.bean.Circle;
import by.alhr.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(128.513);
        Circle circle2 = new Circle(5.25);
        Circle circle3 = new Circle(7);
        Circle circle4 = new Circle(258);
        Circle circle5 = new Circle(21.252);
        Circle circle6 = new Circle(77/77);
        CircleService circleService = new CircleService();

        circleService.calculateArea(circle);
        circleService.calculateArea(circle2);
        circleService.calculateArea(circle3);
        circleService.calculateArea(circle4);
        circleService.calculateArea(circle5);
        circleService.calculateArea(circle6);
    }
}
