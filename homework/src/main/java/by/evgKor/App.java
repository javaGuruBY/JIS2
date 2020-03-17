package by.evgKor;

import by.evgKor.service.EncoderService;

public class App {
    public static void main(String[] args) {
        EncoderService encoder=new EncoderService();
        encoder.encode((short)20);
        encoder.decode('$');

    }
}
