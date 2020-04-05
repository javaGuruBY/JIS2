package by.alhr.Hw4_Task1_SignComparator.bean;

import java.io.Serializable;
import java.util.Objects;

public class Number implements Serializable {
    private int Number;

    public Number() {
    }

    public Number(int number) {
        Number = number;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return Number == number.Number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number);
    }

    @Override
    public String toString() {
        return "Number{" +
                "Number=" + Number +
                '}';
    }
}
