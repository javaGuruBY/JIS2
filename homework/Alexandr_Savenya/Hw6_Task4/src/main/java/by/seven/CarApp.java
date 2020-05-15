package by.seven;

import by.seven.bean.Car;
import by.seven.service.CarService;

public class CarApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new CarService());
        thread.start();
    }
}
