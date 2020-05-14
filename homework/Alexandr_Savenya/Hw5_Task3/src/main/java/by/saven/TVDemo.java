package by.saven;

import by.saven.service.TVService;

public class TVDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new TVService());
        thread.run();
    }
}
