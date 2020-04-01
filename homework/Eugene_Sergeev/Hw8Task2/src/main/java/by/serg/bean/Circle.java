package by.serg.bean;

public class Circle extends AbstractShape {
    private double radius;

    @Override
    public double getArea() {
        this.area = Math.PI*this.radius*this.radius;
        return this.area;
    }

    public Circle(String name, double radius) throws Exception {
        super(name);
        if(radius <= 0) {
            throw new Exception("Radius must be positive");
        }
        this.radius = radius;
    }
}
