package acya.ki;

import acya.ki.service.CarService;

public class CarDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new CarService());
        thread.start();
    }
}
