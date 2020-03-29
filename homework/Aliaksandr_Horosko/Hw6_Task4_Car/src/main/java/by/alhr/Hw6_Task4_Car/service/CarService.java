package by.alhr.Hw6_Task4_Car.service;

import by.alhr.Hw6_Task4_Car.bean.Car;

public class CarService implements Runnable {
    public void accelerate(int targetSpeed, Car auto) {
        System.out.println("current speed "+auto.getCurrentSpeed()+" km/h");
        if (auto.getCurrentSpeed() > targetSpeed) {
            System.out.println("auto should't accelerate");
        } else {
            System.out.println("auto picks up speed:");
            for (int i = auto.getCurrentSpeed(); i < targetSpeed; i++) {
                auto.setCurrentSpeed(auto.getCurrentSpeed()+1);
                System.out.println(auto.getCurrentSpeed() + " km/h");

            }

        }

    }
    public void decelerate(int targetSpeed, Car auto) {
        System.out.println("speed before deceleration " +auto.getCurrentSpeed()+" km/h");
        if (auto.getCurrentSpeed() < targetSpeed) {
            System.out.println("auto should't decelerate");
        } else {
            for (int i = targetSpeed; i >= targetSpeed; i--) {
                System.out.println("speed after decelerate " + i + " km/h");
            }
        }

    }

    boolean isDriving(Car auto) {
        if (auto.getCurrentSpeed() > 0) {
            return true;
        }

        return false;
    }

    boolean canAccelerate(Car auto) {
        if (auto.getCurrentSpeed() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        Car auto = new Car("volkswagen", "metallic-silver", 220, 55);
        CarService autoService = new CarService();
        autoService.accelerate(80, auto);
        autoService.decelerate(60, auto);
        System.out.println("auto is driving " + autoService.isDriving(auto));
        System.out.println("auto can accelerate "+autoService.canAccelerate(auto));
    }
}
