package by.alhr;

import by.alhr.bean.Encoder;
import by.alhr.service.EncoderService;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder((short) 65,'A');
        Encoder encoder1 = new Encoder((short) 88, 'X');
        EncoderService encoderService = new EncoderService();
        encoderService.encode(encoder);
        encoderService.decode(encoder1);


    }

}

