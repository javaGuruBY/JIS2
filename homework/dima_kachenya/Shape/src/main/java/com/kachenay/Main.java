package com.kachenay;


import com.kachenay.abstractShape.figure.Circle;
import com.kachenay.abstractShape.figure.Square;
import com.kachenay.abstractShape.figure.Triangle;
import com.kachenay.shape.Shape;

public class Main {

    public static void main(String[] args) throws Exception {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle("Circle",4);
        shapes[1]=new Square("Square",5);;
        shapes[2]=new Triangle("Triangle",13,15,4);
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }
    }
}
