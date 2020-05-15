package by.seven.service;

import by.seven.bean.Car;

public class CarService implements  Runnable{

    private Car car;

    public CarService() {
    }

    public CarService(Car car){
        this.car = car;
    }

    void accelerate(int targetSpeed) {
        if (car.getCurrentSpeed() >= targetSpeed || car.getCurrentSpeed() >= car.getMaxSpeed()) {
            System.out.println("Автомобиль уже двигается с заданной скоростью");
        } else if (car.getCurrentSpeed() < targetSpeed && targetSpeed < car.getMaxSpeed()){
            for (int i = car.getCurrentSpeed(); i <= targetSpeed; i++) {
                car.setCurrentSpeed(targetSpeed);
                System.out.println("Разгон...\n Скорость: " + i + "км/ч");
            }
        }
    }

    void decelerate(int targetSpeed) {
        if (car.getCurrentSpeed() <= targetSpeed || car.getCurrentSpeed() <= 0) {
            System.out.println("Автомобиль уже двигается с заданной скоростью");
        } else if (car.getCurrentSpeed() > targetSpeed && targetSpeed >= 0) {
            for (int i = car.getCurrentSpeed(); i >=targetSpeed; i--) {
                car.setCurrentSpeed(targetSpeed);
                System.out.println("Замедление...\n скорость: " + i + "км/ч");
            }
        }
    }

    public boolean isDriving() {
        if (car.getCurrentSpeed() > 0) {
            System.out.println("Автомобиль в джвижении");
            return true;
        } return false;
    }

    boolean isStopped() {
        if (car.getCurrentSpeed() <= 0) {
            System.out.println("Автомобиль стоит");
            return true;
        } return  false;
    }

    @Override
    public void run() {
        Car car = new Car("Audi", "white", 240);
        car.setCurrentSpeed(0);
        CarService carService = new CarService(car);
        carService.isStopped();
        carService.accelerate(70);
        carService.isDriving();
        carService.decelerate(0);
        carService.isStopped();
    }
}
