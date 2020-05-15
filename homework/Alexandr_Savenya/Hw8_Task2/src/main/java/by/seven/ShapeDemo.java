package by.seven;

import by.seven.bean.Circle;
import by.seven.bean.Square;
import by.seven.bean.Triangle;
import by.seven.interfaces.Shape;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("Square", 14.0, 17.0);
        shapes[2] = new Circle("Circle", 23.0);
        shapes[1] = new Triangle("Triangle", 8.0, 7.0, 13.0);
        for (Shape shape: shapes) {
            System.out.println(shape.getName() + ": " + shape.getArea());
        }


    }
}

