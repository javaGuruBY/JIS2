package com.kachenya.service;

import com.kachenya.bean.Counter;

public class ServiceForCounter {
    private Counter counter;

    public ServiceForCounter() {
        counter = new Counter();
    }

    public ServiceForCounter(int value, int step) {
        counter = new Counter(step, value);
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public void increment() {
        if (counter.getValue() + counter.getStep() <= 100) {
            counter.setValue(counter.getValue() + counter.getStep());
        } else {
            System.out.println("Значение счетчика превысило 100");
        }
    }

    public void deccrement() {
        if (counter.getValue() + counter.getStep() > 0) {
            counter.setValue(counter.getValue() - counter.getStep());
        } else {
            System.out.println("Значение счетчика не может быть меньше нуля");
        }
    }

    public void reset() {
        counter.setValue(0);
        counter.setStep(1);
        System.out.println("Значение счетчика- 0 \nзначение шага- 1");
    }
}
