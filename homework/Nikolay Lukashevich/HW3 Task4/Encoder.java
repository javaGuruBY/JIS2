package by.nlukash;

public class Encoder {
       private Encoder(){
    }
    public static void encode(short code) {
        System.out.println(code + " =>" + (char) code);
    }

    public static void decode(char symbol){
        System.out.println(symbol + " =>" + (short) symbol);
    }
}
