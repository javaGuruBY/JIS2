package acya.ki;

import acya.ki.service.EncoderService;

public class EncoderDemo {
    public static void main(String[] args) {
        EncoderService.encode((short) 88);
        EncoderService.decode('l');
    }
}