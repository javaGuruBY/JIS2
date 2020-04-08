package by.evgKor.bean;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(String name, double radius) throws Exception {
        super(name);
        if(radius<=0){
            throw new Exception("Error, radius shouldn't be negative");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
