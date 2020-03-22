package by.lukash.counter.bean;

public class Counter {

    private int value;
    private int step;

    public Counter() {
    }

    public Counter(int value, int step) {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        if ((getStep() + getValue()) <= 100) {
            setValue(getValue() + getStep());
        }

    }

    public void decrement() {
        if ((getValue() - getStep()) >= 0) {
            setValue(getValue() - getStep());
        }
    }

    public void clear() {
        this.value = 0;
        this.step = 1;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setStep(int step) {
        if (step >= 0 && step <= 10) {
            this.step = step;
        }
    }

    public int getStep() {
        return step;
    }
}




