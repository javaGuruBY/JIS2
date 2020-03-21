package by.home.service;

public class EncoderService {

    public EncoderService() {
    }

    public void encode(short code) {
        System.out.println(code + " => " + (char) code);
    }
    public void decode(char symbol) {
        System.out.println( symbol + " => " + (short) symbol);
    }

}
