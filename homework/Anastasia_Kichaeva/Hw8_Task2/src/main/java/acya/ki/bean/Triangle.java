package acya.ki.bean;

import java.util.Objects;

public class Triangle extends AbstractShape {
    private double theFirstTriangleSideLength;
    private double theSecondTriangleSideLength;
    private double theThirdTriangleSideLength;

    public Triangle(String name, double theFirstTriangleSideLength, double theSecondTriangleSideLength, double theThirdTriangleSideLength) {
        super(name);
        this.theFirstTriangleSideLength = theFirstTriangleSideLength;
        this.theSecondTriangleSideLength = theSecondTriangleSideLength;
        this.theThirdTriangleSideLength = theThirdTriangleSideLength;
    }

    public Triangle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.theFirstTriangleSideLength, theFirstTriangleSideLength) == 0 &&
                Double.compare(triangle.theSecondTriangleSideLength, theSecondTriangleSideLength) == 0 &&
                Double.compare(triangle.theThirdTriangleSideLength, theThirdTriangleSideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), theFirstTriangleSideLength, theSecondTriangleSideLength, theThirdTriangleSideLength);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "theFirstTriangleSideLength=" + theFirstTriangleSideLength +
                ", theSecondTriangleSideLength=" + theSecondTriangleSideLength +
                ", theThirdTriangleSideLength=" + theThirdTriangleSideLength +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        double sidePerimeter = (theFirstTriangleSideLength + theSecondTriangleSideLength + theThirdTriangleSideLength)/2;
        double areaOfTriangle = Math.sqrt(sidePerimeter * (sidePerimeter-theThirdTriangleSideLength) * (sidePerimeter - theSecondTriangleSideLength) * (sidePerimeter - theThirdTriangleSideLength));
        return areaOfTriangle;
    }
}
