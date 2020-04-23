package by.alhr.Hw8_Task1_Animals.service;

import java.util.Objects;

public class Bird extends Animal {
    protected int toFly;
    public Bird(String view, int toFly) {
        super(view);
        this.toFly = toFly;
    }
    public void flyFar(int toFly){
        this.toFly = toFly;
    }
}
