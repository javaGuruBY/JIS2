package acya.ki.service;

import acya.ki.CarDemo;
import acya.ki.bean.CarBean;

public class CarService implements Runnable{

    private CarBean carBean;

    public CarService() {
    }

    public CarService(CarBean carBean) {
        this.carBean = carBean;
    }

    public void accelerate(int targetSpeed){
        if (carBean.getCurrentSpeed() >= targetSpeed || carBean.getCurrentSpeed() >= carBean.getMaxSpeed()){
            System.out.println("Current speed is equal or more than target speed or max speed!");
        } else if (carBean.getCurrentSpeed() < targetSpeed && targetSpeed <= carBean.getMaxSpeed()) {
            for (int i = carBean.getCurrentSpeed() + 1; i <= targetSpeed; i++) {
                carBean.setCurrentSpeed(targetSpeed);
                System.out.println("Accelerate to target speed: " + i + " klm.");
            }
        } else if (carBean.getCurrentSpeed() < targetSpeed && targetSpeed > carBean.getMaxSpeed()) {
            for (int i = carBean.getCurrentSpeed() + 1; i <= carBean.getMaxSpeed(); i++) {
                carBean.setCurrentSpeed(carBean.getMaxSpeed());
                System.out.println("Target speed more than max speed, therefore accelerate to max speed: " + i + " klm.");
            }
        }


    }
    public void decelerate(int targetSpeed){
        if (carBean.getCurrentSpeed() <= targetSpeed || carBean.getCurrentSpeed() <= 0){
            System.out.println("Current speed is equal or less than target speed or 0!");
        } else if (carBean.getCurrentSpeed() >= targetSpeed && targetSpeed > 0) {
            for (int i = carBean.getCurrentSpeed() - 1; i >= targetSpeed; i--) {
                carBean.setCurrentSpeed(targetSpeed);
                System.out.println("Decelerate to target speed: " + i + " klm.");
            }
        } else if (carBean.getCurrentSpeed() >= targetSpeed && targetSpeed <= 0) {
            for (int i = carBean.getCurrentSpeed() - 1; i >= 0; i--) {
                carBean.setCurrentSpeed(0);
                System.out.println("Target speed less than or equal to 0, therefore decelerate to zero: " + i + " klm.");
            }
        }
    }

    public boolean isDriving(){
        if (carBean.getCurrentSpeed() <= 0) {
            System.out.println("Current speed equals or less than 0 klm. Car is stopped!");
            return false;
        } return true;
    }

    public boolean isStopped(){
        if (carBean.getCurrentSpeed() > 0){
            System.out.println("Current speed more than 0 klm. Car is driving!");
            return false;
        } return true;
    }

    public boolean canAccelerate(){
        if (carBean.getCurrentSpeed() >= carBean.getMaxSpeed()){
            System.out.println("Current speed is equal or more than max speed. Car can't to accelerate!");
            return false;
        } return true;
    }




    @Override
    public void run() {
        CarBean carBean1 = new CarBean("BMW", "Black", 2);
        carBean1.setCurrentSpeed(0);
        CarService carService1 = new CarService(carBean1);
        carService1.isDriving();
        carService1.accelerate(3);
        System.out.println(carBean1);
        carService1.isStopped();
        carService1.canAccelerate();



        CarBean carBean2 = new CarBean("Volvo", "Grey metallic", 320);
        carBean2.setCurrentSpeed(20);
        CarService carService2 = new CarService(carBean2);
        carService2.decelerate(19);
        carService2.isDriving();
        carService2.isStopped();
        carService2.canAccelerate();

    }
}
