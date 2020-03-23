package com.kachenya;

import com.kachenya.bean.Counter;
import com.kachenya.service.ServiceForCounter;

public class Main {
    public static void main(String[] args) {
        ServiceForCounter counter =new ServiceForCounter();

        System.out.println(counter.getCounter().getValue());
        System.out.println(counter.getCounter().getStep());

        counter.increment();

        System.out.println(counter.getCounter().getValue());
      
        counter.getCounter().setStep(5);
        counter.increment();
        counter.getCounter().setStep(2);
        counter.deccrement();

        System.out.println(counter.getCounter().getValue());
        System.out.println(counter.getCounter().getStep());


    }
}
