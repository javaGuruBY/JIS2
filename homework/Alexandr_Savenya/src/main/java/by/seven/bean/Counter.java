package by.seven.bean;

import java.io.Serializable;
import java.util.Objects;

public class Counter implements Serializable {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public Counter(int value, int step) {
        this.value = value;
        this.step = step;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
        } else {
            System.out.println("Некоректное знчение , попробуйте сново");
        }
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if (step > 0 && step <= 10) {
            this.step = step;
        } else {
            System.out.println("Некоректное знчение , попробуйте сново");
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