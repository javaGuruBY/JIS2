package by.seven.bean;

import by.seven.interfaces.Shape;

import java.util.Objects;

public abstract class  AbstractShape implements Shape {
    protected String name;

    public AbstractShape() {
    }


    public AbstractShape(String name) {
       this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractShape that = (AbstractShape) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
