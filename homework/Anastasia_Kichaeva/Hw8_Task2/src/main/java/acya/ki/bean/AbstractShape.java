package acya.ki.bean;

import java.util.Objects;

public abstract class AbstractShape implements Shape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public AbstractShape() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractShape)) return false;
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


