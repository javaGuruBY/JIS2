package com.kachenya.serviceforcar;

import com.kachenya.car.Car;

public class ServiceForCar {
    private Car car;

    public ServiceForCar() {
        car = new Car();
    }

    public ServiceForCar(String model, String color, int maxSpeed, int currentSpeed) {
        car = new Car(model, color, maxSpeed, currentSpeed);
    }

    public Car getCar() {
        return car;
    }

    public void accelerate(int targetSpeed) {
        System.out.println("Скорость до ускорения =" + car.getCurrentSpeed() + " км/ч");
        int divTargetSpeedAndCurrentSpeed = targetSpeed - car.getCurrentSpeed();
        if (divTargetSpeedAndCurrentSpeed > 0) {
            for (int i = 1; i <= divTargetSpeedAndCurrentSpeed; i++) {
                car.setCurrentSpeed(car.getCurrentSpeed() + 1);
                System.out.println("Скорость во время ускорения=" + car.getCurrentSpeed() + " км/ч");
                if (car.getMaxSpeed() <= car.getCurrentSpeed()) {
                    car.setCurrentSpeed(car.getMaxSpeed());
                    break;
                }
            }
        }
        System.out.println("Скорость после ускорения =" + car.getCurrentSpeed() + " км/ч");
    }

    public void decelerate(int targetSpeed) {
        int divCurrentSpeedAndTargetSpeed = car.getCurrentSpeed() - targetSpeed;
        System.out.println("Скорость до торможения = " + car.getCurrentSpeed() + " км/ч");
        if (divCurrentSpeedAndTargetSpeed > 0) {
            for (int i = 0; i < divCurrentSpeedAndTargetSpeed; i++) {
                car.setCurrentSpeed(car.getCurrentSpeed() - 1);
                System.out.println("Скорость во время торможения = " + car.getCurrentSpeed() + " км/ч");
                if (car.getCurrentSpeed() <= 0) {
                    car.setCurrentSpeed(0);
                    break;
                }
            }
        }
        System.out.println("Скорость после торможения =" + car.getCurrentSpeed() + " км/ч");
    }

    public boolean isDiriving() {
        if (car.getCurrentSpeed() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isStopped(){
        if(car.getCurrentSpeed()==0){
            return true;
        }else{
            return false;
        }
    }
}
