package by.serg;

import by.serg.bean.AbstractShape;
import by.serg.bean.Circle;
import by.serg.bean.Square;
import by.serg.bean.Triangle;

public class ShapeDemo {
    public static void main(String[] args) throws Exception {
        AbstractShape[] array = new AbstractShape[6];
        array[0] = new Circle("First Circle", 10);
        array[1] = new Square("First Square", 5);
        array[2] = new Triangle("First Triangle", 3,4,5);
        array[3] = new Circle("Second Circle", 5);
        array[4] = new Square("Second Square", 7);
        array[5] = new Triangle("Seconds Triangle", 10, 10,10*Math.sqrt(2) );
        for (AbstractShape figure: array) {
            System.out.println(figure.getName() + " : " + figure.getArea());
        }
    }
}
