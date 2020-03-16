package com.kachenya.encoder;

public class Encoder {

    public static void code(short code) {
        char mySymbol = (char) code;
        System.out.println(code + " => " + mySymbol);
    }

    public static void decoder(char symbol) {
        short myCode = (short) symbol;
        System.out.println(symbol + " => " + myCode);
    }

}
