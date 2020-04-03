package by.evgKor.bean;

public class Triangle extends AbstractShape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double Pp;

    public Triangle(String name, double sideA, double sideB, double sideC) throws Exception {
        super(name);
        if(sideA<=0||sideB<=0||sideC<=0){
            throw new Exception("Sides shouldn't be negative");
        }
        if(sideA>(sideB+sideC)
                ||sideB>(sideA+sideC)
                ||sideC>(sideA+sideB)){
            throw new Exception("One side shouldn't bigger then other two");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double Pp = (sideA + sideB + sideC) / 2;
        return Math.sqrt(Pp * (Pp - sideA) * (Pp - sideB) * (Pp - sideC));
    }


}

