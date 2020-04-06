package com.kachenay.abstractShape;

import com.kachenay.shape.Shape;

public abstract class AbstractShape implements Shape {
    protected String name;
    protected double lenghtOfSquare;
    protected double radiusOfCircle;
    protected double firstLenghtOfTringle;
    protected double secondLenghtOfTringle;
    protected double thirdLenghtOfTringle;
    
    public String getName() {
        return name;
    }



}
