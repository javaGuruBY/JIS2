package by.evgKor.service;

import by.evgKor.bean.Auto;

public class AutoService implements Runnable {
    public void accelerate(int targetSpeed, Auto auto) {
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
    public void decelerate(int targetSpeed, Auto auto) {
        System.out.println("speed before deceleration " +auto.getCurrentSpeed()+" km/h");
        if (auto.getCurrentSpeed() < targetSpeed) {
            System.out.println("auto should't decelerate");
        } else {
            for (int i = targetSpeed; i >= targetSpeed; i--) {
                System.out.println("speed after decelerate " + i + " km/h");
            }
        }

    }

    boolean isDriving(Auto auto) {
        if (auto.getCurrentSpeed() > 0) {
            return true;
        }

        return false;
    }

    boolean canAccelerate(Auto auto) {
        if (auto.getCurrentSpeed() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        Auto auto = new Auto("M5", "Black", 320, 60);
        AutoService autoService = new AutoService();
        autoService.accelerate(120, auto);
        autoService.decelerate(100, auto);
        System.out.println("auto is driving " + autoService.isDriving(auto));
        System.out.println("auto can accelerate "+autoService.canAccelerate(auto));
    }
}
