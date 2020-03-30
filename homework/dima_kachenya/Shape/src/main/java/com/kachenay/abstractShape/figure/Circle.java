package com.kachenay.abstractShape.figure;

import com.kachenay.abstractShape.AbstractShape;

public class Circle extends AbstractShape {
    public Circle(String name,double radiusOfCircle) throws Exception {
        if(radiusOfCircle<=0){
            throw new Exception("Radius of circle is negative or equal 0");
        }
        this.radiusOfCircle=radiusOfCircle;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return Math.PI*Math.pow(radiusOfCircle,2);
    }
}
