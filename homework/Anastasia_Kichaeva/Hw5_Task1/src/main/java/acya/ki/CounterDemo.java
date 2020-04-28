package acya.ki;

import acya.ki.bean.CounterBean;
import acya.ki.service.CounterService;

public class CounterDemo {
    public static void main(String[] args) {
        CounterService counter = new CounterService();

        System.out.println(counter.getCounterBean().getValue());
        System.out.println(counter.getCounterBean().getStep());

        counter.increment();

        System.out.println(counter.getCounterBean().getValue());

        counter.getCounterBean().setStep(7);
        counter.increment();
        counter.getCounterBean().setStep(6);
        counter.decrement();

        System.out.println(counter.getCounterBean().getValue());
        System.out.println(counter.getCounterBean().getStep());


    }


}
