package acya.ki.bean;

import java.io.Serializable;
import java.util.Objects;

public class CounterBean implements Serializable {
    private int value;
    private int step;

    public CounterBean() {
        this.value = 0;
        this.step = 1;
    }

    public CounterBean(int value, int step) {
        this.value = value;
        this.step = step;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value>= 0 && value <= 100) {
            this.value = value;
        } else {
            System.out.println("Значение вышло из диапазона 0-100");
        }
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if(step>= 0 && step<=10) {
            this.step = step;
        } else {
            System.out.println("Значение вышло из диапазона 0-10");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CounterBean)) return false;
        CounterBean that = (CounterBean) o;
        return value == that.value &&
                step == that.step;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, step);
    }

    @Override
    public String toString() {
        return "CounterBean{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
