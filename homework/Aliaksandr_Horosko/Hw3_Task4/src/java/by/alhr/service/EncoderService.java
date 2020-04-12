package by.alhr.service;

import java.beans.Encoder;

public class EncoderService {

    public void encode(Encoder encoder) {
        System.out.println(encoder.getCode() + " => " + (char) encoder.getCode());
    }

    public void decode(Encoder encoder) {
        System.out.println(encoder.getSymbol() + " => " + (short) encoder.getSymbol());
    }
}
