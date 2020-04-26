package by.alhr.Hw8_Task2_Shape.bean;

import by.alhr.Hw8_Task2_Shape.interfaces.Shape;

public abstract class AbstractShape implements Shape {
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public AbstractShape() {
    }

    @Override
    public String getName() {
        return name;
    }
}
