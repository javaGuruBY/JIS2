package by.alhr.Hw5_task1.service;

import by.alhr.Hw5_task1.bean.Counter;

public class CounterService implements Runnable {
    private Counter counter;

    public CounterService() {
    }

    public CounterService(Counter counter) {
        this.counter = counter;
    }

    public void increment() {
        counter.setValue(counter.getValue() + counter.getStep());
        System.out.println("Current value counter = " + counter.getValue());
    }

    public void decrement () {
        counter.setValue(counter.getValue() - counter.getStep());
        System.out.println("Current value counter = " + counter.getValue());
    }

    public void reset (){
        counter.setValue(0);
        counter.setStep(0);
    }

    @Override
    public void run() {
        Counter counter = new Counter(0,1);
        CounterService counterService = new CounterService(counter);
        counter.setStep(10);
        for(int i = 0; i<10; i++) {
             counterService.increment();

        }
        for (int i = 0; i<10; i++) {
            counterService.decrement();
        }
    }
}