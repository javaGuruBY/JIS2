package by.lukash.counter.service;


import by.lukash.counter.bean.Counter;

import java.io.Serializable;

public class CounterService  implements Runnable {

    @Override
    public void run() {
            Counter counter = new Counter();
            counter.setValue(5);
            counter.setStep(1);
            counter.increment();
            System.out.println("IncrementDemo: ");
            System.out.println("counter.getValue() = " + counter.getValue());
            System.out.println("counter.getStep() = " + counter.getStep());

        counter = new Counter();
            counter.setValue(37);
            counter.setStep(7);
            counter.decrement();
            System.out.println("\nDecrementDemo: ");
            System.out.println("counter.getValue() = " + counter.getValue());
            System.out.println("counter.getStep() = " + counter.getStep());

        counter = new Counter();
            counter.clear();
            System.out.println("\nClearDemo: ");
            System.out.println("counter.getValue() = " + counter.getValue());
            System.out.println("counter.getStep() = " + counter.getStep());

        counter = new Counter();
            counter.setValue(30);
            System.out.println("\nsetValueDemo: ");
            System.out.println("counter.getValue() = " + counter.getValue());
            System.out.println("counter.getStep() = " + counter.getStep());

        counter = new Counter();
            counter.setStep(10);
            System.out.println("\nsetStepDemo: ");
            System.out.println("counter.getValue() = " + counter.getValue());
            System.out.println("counter.getStep() = " + counter.getStep());
        }

    }




