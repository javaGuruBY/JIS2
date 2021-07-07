package by.serg;

import by.serg.bean.Car;


public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW E36", "Dark green", 160);
        System.out.println(car.canAccelerate());
        System.out.println("car = " + car);
        car.accelerate(170);
        System.out.println("car = " + car);
        car.decelerate(180);
        System.out.println("car = " + car);
        System.out.println(car.isDriving());
        car.decelerate(-10);
        System.out.println("car = " + car);
    }
}
