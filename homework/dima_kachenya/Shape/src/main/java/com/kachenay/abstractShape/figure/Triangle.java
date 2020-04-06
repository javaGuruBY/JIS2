package com.kachenay.abstractShape.figure;

import com.kachenay.abstractShape.AbstractShape;

public class Triangle extends AbstractShape {
    public Triangle(String name, double firstLenghtOfTringle, double secondLenghtOfTringle, double thirdLenghtOfTringle) throws Exception {
        this.name = name;
        if (firstLenghtOfTringle > (secondLenghtOfTringle + thirdLenghtOfTringle)) {
            throw new Exception("firstLenghtOfTrinagle more then else");
        } else if (secondLenghtOfTringle > firstLenghtOfTringle + thirdLenghtOfTringle) {
            throw new Exception("secondLenghtOfTrinagle more then else");
        } else if (thirdLenghtOfTringle > firstLenghtOfTringle + secondLenghtOfTringle) {
            throw new Exception("thirdLenghtOfTrinagle more then else");
        }
        this.firstLenghtOfTringle = firstLenghtOfTringle;
        this.secondLenghtOfTringle = secondLenghtOfTringle;
        this.thirdLenghtOfTringle = thirdLenghtOfTringle;
    }


    public double getArea() {
        double p = (firstLenghtOfTringle + secondLenghtOfTringle + thirdLenghtOfTringle) / 2;
        return Math.sqrt(p * (p - firstLenghtOfTringle) * (p - secondLenghtOfTringle) * (p - thirdLenghtOfTringle));

    }
}
