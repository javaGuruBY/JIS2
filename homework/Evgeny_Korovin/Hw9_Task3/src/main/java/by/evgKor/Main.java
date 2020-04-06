package by.evgKor;

import by.evgKor.service.Library;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(new Library());
        thread.start();
    }
}
