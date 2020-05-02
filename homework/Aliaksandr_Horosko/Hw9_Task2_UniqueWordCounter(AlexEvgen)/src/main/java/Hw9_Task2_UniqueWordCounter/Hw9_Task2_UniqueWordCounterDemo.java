package Hw9_Task2_UniqueWordCounter;

import Hw9_Task2_UniqueWordCounter.service.UniqueWordCounterService;

public class Hw9_Task2_UniqueWordCounterDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new UniqueWordCounterService());
        thread.start();
    }
}
