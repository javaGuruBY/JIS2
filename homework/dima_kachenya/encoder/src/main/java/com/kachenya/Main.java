package com.kachenya;

import com.kachenya.encoder.Encoder;

public class Main {
    public static void main(String[] args) {
        Encoder.code((short) 65);
        Encoder.decoder('X');
    }
}
