package by.evgKor;

import by.evgKor.bean.Circle;
import by.evgKor.bean.Square;
import by.evgKor.bean.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Square("Square", 72.0);
        shapes[2] = new Triangle("Triangle", 3.4, 4.2, 4.4);
        shapes[3] = new Circle("Circle2", 8.2);
        shapes[4] = new Triangle("Triangle2",10.2,3.0,4.0);
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());

        }
    }

}
