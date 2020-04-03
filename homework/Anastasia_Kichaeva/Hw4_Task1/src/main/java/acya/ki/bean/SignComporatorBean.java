
package acya.ki.bean;

import java.io.Serializable;
import java.util.Objects;

public class SignComporatorBean implements Serializable {

    private  int number;

    public SignComporatorBean() {
    }

    public SignComporatorBean(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SignComporatorBean)) return false;
        SignComporatorBean that = (SignComporatorBean) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "SignComporatorBean{" +
                "number=" + number +
                '}';
    }
}

