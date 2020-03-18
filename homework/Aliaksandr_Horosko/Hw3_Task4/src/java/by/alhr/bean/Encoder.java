package by.alhr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Encoder implements Serializable {
    public void encode(short code) {
        System.out.println(code + " => " + (char) code);
    }

    public void decode(char symbol) {
        System.out.println(symbol + " => " + (short) symbol);
    }
}


