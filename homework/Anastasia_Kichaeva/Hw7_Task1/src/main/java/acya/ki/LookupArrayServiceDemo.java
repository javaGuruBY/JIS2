package acya.ki;

import acya.ki.service.LookupArrayService;

public class LookupArrayServiceDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new LookupArrayService());
        thread.start();
    }


}
