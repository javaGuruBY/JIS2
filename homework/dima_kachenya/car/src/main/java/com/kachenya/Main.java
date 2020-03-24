package com.kachenya;

import com.kachenya.serviceforcar.ServiceForCar;

public class Main {
    public static void main(String[] args) {
        ServiceForCar lada=new ServiceForCar("Lada","red",130,60);
        lada.accelerate(90);
        lada.decelerate(0);
        System.out.println("lada.isDiriving() = " + lada.isDiriving());
        System.out.println("lada.isStopped() = " + lada.isStopped());

    }
}
