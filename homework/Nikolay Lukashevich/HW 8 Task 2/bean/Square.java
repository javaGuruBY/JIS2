package by.lukash.Shape.bean;

public class Square extends AbstractShape {
    public double sideOfSquare;

    @Override
    public double getArea() {
        this.area = this.sideOfSquare*this.sideOfSquare;
        return this.area;
    }
    public Square(String name,String color, double sideOfSquare){
        super(name, color);
        this.sideOfSquare = sideOfSquare;
    }
}
