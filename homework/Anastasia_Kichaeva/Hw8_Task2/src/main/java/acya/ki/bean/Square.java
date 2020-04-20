package acya.ki.bean;

import java.util.Objects;

public class Square extends AbstractShape {
    private double sideSquareLength;

    public Square(String name, double sideSquareLength) {
        super(name);
        this.sideSquareLength = sideSquareLength;
    }

    public Square(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.sideSquareLength, sideSquareLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideSquareLength);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideSquareLength=" + sideSquareLength +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        double areaOfSquare = sideSquareLength * sideSquareLength;
        return areaOfSquare;
    }
}
