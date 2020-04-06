package by.lukash.Shape.bean;

public class Circle extends AbstractShape{
    private double radius;
    @Override
    public double getArea() {
        this.area = Math.PI*this.radius*this.radius;
        return this.area;
    }
    public Circle(String name, String color, double radius){
        super(name, color);
        this.radius = radius;
    }
}
