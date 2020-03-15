package com.kachenya;

import com.kachenya.bean.Circle;
import com.kachenya.service.ServiceForCircle;

public class Main {
    public static void main(String[] args) {
        ServiceForCircle myCircle=new ServiceForCircle();
        myCircle.setCircle(new Circle(2.4d));
        System.out.println(myCircle.calculateArea());
    }
}
