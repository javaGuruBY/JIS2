package acya.ki.service;

import acya.ki.bean.Circle;

public class CircleService {
    private Circle circle;

    public CircleService(){

    }
    public CircleService(Circle circle){
        this.circle = circle;
    }
    public Circle getCircle(){
        return circle;

    }
    public void setCircle(Circle circle){
        this.circle = circle;
    }

    public void calculateArea(Circle circle){
        System.out.println("If the radius of circle = " + circle.getRadius() + ", that the area is " + Math.PI * (circle.getRadius() * circle.getRadius()));
    }

}
