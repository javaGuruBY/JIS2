package by.serg.bean;

public class Triangle extends AbstractShape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double halfPerimeter;

    public double getArea() {
        halfPerimeter = (firstSide + secondSide + thirdSide)/2;
        area = Math.sqrt(halfPerimeter*(halfPerimeter-firstSide)*(halfPerimeter-secondSide)*(halfPerimeter-thirdSide));
        return area;
    }

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) throws Exception {
        super(name);
        if(firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new Exception("All sides must be positive");
        }
        if (firstSide > (secondSide + thirdSide)) {
            throw new Exception("One side can not be bigger then 2 others");
        } else if (secondSide > firstSide + thirdSide) {
            throw new Exception("One side can not be bigger then 2 others");
        } else if (thirdSide > firstSide + secondSide) {
            throw new Exception("One side can not be bigger then 2 others");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
}
