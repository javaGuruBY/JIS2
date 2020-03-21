package by.evgKor.jisTwo.service;

import by.evgKor.jisTwo.bean.Counter;

import java.util.Objects;

public class CounterService implements Runnable {
    private Counter counter;

    public void increment() {
        counter.setValue(counter.getValue()+counter.getStep());
        System.out.println("Result of incrementing = " + counter.getValue());
    }

    public void decrement() {
        counter.setValue(counter.getValue()-counter.getStep());
        System.out.println("Result of decrementing = " + counter.getValue());
    }

    public void reset() {
        counter.setValue(0);
        counter.setStep(0);
    }

    public CounterService() {
    }

    public CounterService(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        Counter counter = new Counter(0, 1);
        CounterService counterService = new CounterService(counter);
        counter.setStep(5);
        for(int i = 0; i<10; i++) {
            counterService.increment();
        }
        for (int i = 0; i<10; i++) {
            counterService.decrement();
        }
    }
}



