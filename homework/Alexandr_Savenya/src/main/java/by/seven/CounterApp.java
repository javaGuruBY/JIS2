package by.seven;

import by.seven.bean.Counter;
import by.seven.service.CounterService;

public class CounterApp {
    public static void main(String[] args) {
        CounterService counter = new CounterService();

        System.out.println(counter.getCounter().getValue());
        System.out.println(counter.getCounter().getStep());

        counter.increment();

        System.out.println(counter.getCounter().getValue());

        counter.getCounter().setStep(5);
        counter.increment();
        counter.getCounter().setStep(2);
        counter.decrement();

        System.out.println(counter.getCounter().getValue());
        System.out.println(counter.getCounter().getStep());

        CounterService counter2 =  new CounterService(2,5);
        counter2.increment();
    }
}