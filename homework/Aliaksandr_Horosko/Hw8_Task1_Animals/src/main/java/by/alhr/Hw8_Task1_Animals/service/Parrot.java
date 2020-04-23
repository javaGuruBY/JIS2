package by.alhr.Hw8_Task1_Animals.service;

import java.util.Objects;

public class Parrot extends Bird {
    private String name;

    public Parrot(String view, int toFly, String name) {
        super(view, toFly);
        this.name = name;
    }

    public void newName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(name, parrot.name);
    }

    @Override
    public String toString() {
        return "Parrot: " +
                "My name is = " + name +
                ", range of flight " + toFly + " km" +
                ", My view = " + view + "!!!";
    }
}
