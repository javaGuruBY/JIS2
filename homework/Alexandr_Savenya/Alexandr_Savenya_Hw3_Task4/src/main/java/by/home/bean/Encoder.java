package by.home.bean;

import java.io.Serializable;

public class Encoder implements Serializable {
    public void encode(short code) {
        System.out.println(code + " => " + (char) code);
    }
    public void decode(char symbol) {
        System.out.println( symbol + " => " + (short) symbol);
    }
}
