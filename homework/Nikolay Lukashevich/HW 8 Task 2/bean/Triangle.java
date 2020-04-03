package by.lukash.Shape.bean;

public class Triangle extends AbstractShape {
    public double storonaA;
    public double storonaB;
    public double storonaC;
    public double halfPerimeter;

    @Override
    public double getArea() {
        halfPerimeter = (storonaA+storonaB+storonaC)/2;
        area = Math.sqrt(halfPerimeter*(halfPerimeter-storonaA)*(halfPerimeter-storonaB)*(halfPerimeter-storonaC));
        return area;
    }
    public Triangle(String name, String color, double storonaA, double storonaB, double storonaC) {
        super(name, color);
        this.storonaA = storonaA;
        this.storonaB = storonaB;
        this.storonaC = storonaC;
    }
}

