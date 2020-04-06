package com.kachenay.abstractShape.figure;

import com.kachenay.abstractShape.AbstractShape;

public class Square extends AbstractShape {
    public Square(String name,double lenghtOfSquare) throws Exception {
       if(lenghtOfSquare<=0){
           throw  new Exception("Lenght of square is negative or equal 0");
       }
        this.name=name;
        this.lenghtOfSquare=lenghtOfSquare;
    }

    public double getArea() {
        return Math.pow(lenghtOfSquare,2);
    }
}
