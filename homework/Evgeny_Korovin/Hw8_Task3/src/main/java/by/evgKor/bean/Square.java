package by.evgKor.bean;

public class Square extends AbstractShape {

    private double side;

    public Square(String name, double side) throws Exception {
        super(name);
        if (side <= 0) {
            throw new Exception("Error!!! Correct the side, side should be positive");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
