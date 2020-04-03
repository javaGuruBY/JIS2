package by.evgKor;

import by.evgKor.bean.Circle;
import by.evgKor.service.CircleService;

public class App {
    public static void main(String[] args) {
        Circle result1=new Circle(5);
        CircleService circleService=new CircleService();
        System.out.println("area = "+circleService.calculateArea(result1));
    }
}
