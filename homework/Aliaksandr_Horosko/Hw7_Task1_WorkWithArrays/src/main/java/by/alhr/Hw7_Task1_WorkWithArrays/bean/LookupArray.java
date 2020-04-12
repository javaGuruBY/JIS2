package by.alhr.Hw7_Task1_WorkWithArrays.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class LookupArray implements Serializable {
    int myArray [];
    int value;

    public LookupArray() {
    }

    public LookupArray(int[] myArray, int value) {
        this.myArray = myArray;
        this.value = value;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean emptyArray (int[] myArray) {
        if (myArray.length == 0) {
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupArray that = (LookupArray) o;
        return value == that.value &&
                Arrays.equals(myArray, that.myArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(value);
        result = 31 * result + Arrays.hashCode(myArray);
        return result;
    }

    @Override
    public String toString() {
        return "LookupArray{" +
                "myArray=" + Arrays.toString(myArray) +
                ", value=" + value +
                '}';
    }
}
