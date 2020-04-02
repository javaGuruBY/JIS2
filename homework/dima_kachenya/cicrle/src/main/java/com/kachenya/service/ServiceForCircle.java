package com.kachenya.service;

import com.kachenya.bean.Circle;

public class ServiceForCircle {
    private Circle circle;

    public ServiceForCircle() {
    }

    public ServiceForCircle(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

}
