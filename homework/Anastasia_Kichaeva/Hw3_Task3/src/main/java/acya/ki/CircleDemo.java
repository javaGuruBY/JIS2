package acya.ki;

import acya.ki.bean.Circle;
import acya.ki.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(3.5d);
        Circle secondCircle = new Circle(7.8d);
        CircleService circleService = new CircleService();
        circleService.calculateArea(secondCircle);
    }
}
