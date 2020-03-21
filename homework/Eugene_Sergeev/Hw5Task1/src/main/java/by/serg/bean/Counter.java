package by.serg.bean;

import java.io.Serializable;
import java.util.Objects;

public class Counter implements Serializable {
    private int value;
    private int step;

    public Counter() {
    }

    public Counter(int value, int step) {
        this.value = value;
        this.step = step;
        System.out.println("New counter value = " + value + ", step = " + step);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
        } else {
            System.out.println("Error: value must be from 0 to 100");
        }
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if (step >= 1 && step <= 10) {
            this.step = step;
            System.out.println("Counter step been set to " + step);
        } else {
            System.out.println("Error: step must be from 1 to 10");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return value == counter.value &&
                step == counter.step;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, step);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
