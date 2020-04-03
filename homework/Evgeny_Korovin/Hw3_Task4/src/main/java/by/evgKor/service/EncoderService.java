package by.evgKor.service;

public class EncoderService {
    public void encode(short code){
        System.out.println(code+" ->"+(char)code);
    }
    public void decode(char symbol){
        System.out.println(symbol+"->"+(short)symbol);
    }
}
