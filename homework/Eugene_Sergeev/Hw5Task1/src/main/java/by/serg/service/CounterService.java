package by.serg.service;

import by.serg.bean.Counter;

import java.util.Objects;


public class CounterService implements Runnable {

    private Counter counter;

    public void increment() {
        System.out.println("Incrementing...");
        counter.setValue(counter.getValue()+counter.getStep());
        System.out.println("Counter value = " + counter.getValue());
    }

    public void decrement() {
        System.out.println("Decrementing...");
        counter.setValue(counter.getValue()-counter.getStep());
        System.out.println("Counter value = " + counter.getValue());
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

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CounterService that = (CounterService) o;
        return Objects.equals(counter, that.counter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(counter);
    }

    @Override
    public String toString() {
        return "CounterService{" +
                "counter=" + counter +
                '}';
    }

    @Override
    public void run() {
        Counter counter = new Counter(0, 1);
        CounterService counterService = new CounterService(counter);
        counter.setStep(10);
        for(int i = 0; i != 11; i++) {
            counterService.increment();
        }
        for (int i = 0; i!= 11; i++) {
            counterService.decrement();
        }
    }
}
