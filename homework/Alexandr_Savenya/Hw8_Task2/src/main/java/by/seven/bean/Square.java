package by.seven.bean;

import java.util.Objects;

public class Square extends AbstractShape {
    protected double length;
    protected double width;

    public Square(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public Square() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0 &&
                Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        double areaOfSquare = length * width;
        return areaOfSquare;
    }
}
