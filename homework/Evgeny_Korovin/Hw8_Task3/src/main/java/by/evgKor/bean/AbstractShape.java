package by.evgKor.bean;

import by.evgKor.Shape;

import java.util.Objects;

public abstract class AbstractShape implements Shape {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    public AbstractShape(String name) {
        this.name = name;
    }
}
