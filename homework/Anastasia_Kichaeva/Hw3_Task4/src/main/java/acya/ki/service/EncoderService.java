package acya.ki.service;

public class EncoderService {
    public static void encode(short code){
        char mySymbol = (char) code;
        System.out.println(code + " => " + mySymbol);
    }

    public static void decode(char symbol){
        short myCode = (short) symbol;
        System.out.println(symbol + " => " + myCode);
    }
}
