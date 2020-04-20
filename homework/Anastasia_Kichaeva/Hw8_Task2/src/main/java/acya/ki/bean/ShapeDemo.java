package acya.ki.bean;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square("Square", 4.0d);
        shapes[1] = new Circle("Circle", 7.6d);
        shapes[2] = new Triangle("Triangle", 5.0d, 7.5d, 8.2d);
        shapes[3] = new Circle("Circle", 14.9d);
        shapes[4] = new Square("Square", 5.4d);
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }

    }
}
