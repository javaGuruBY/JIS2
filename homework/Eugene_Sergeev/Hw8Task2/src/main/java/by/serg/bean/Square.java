package by.serg.bean;

public class Square extends AbstractShape {
    private double side;

    public double getArea() {
        this.area = side*side;
        return area;
    }

    public Square(String name, double side) throws Exception {
        super(name);
        if(side <= 0) {
            throw new Exception("Side must be positive");
        }
        this.side = side;
    }
}
