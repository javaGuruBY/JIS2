package by.seven;

import by.seven.service.Copy;

public class CopyDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Copy());
        thread.start();
    }
}
