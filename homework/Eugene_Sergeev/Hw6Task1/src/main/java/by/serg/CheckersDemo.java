package by.serg;

import by.serg.bean.DoWhileOddChecker;
import by.serg.bean.ForOddChecker;
import by.serg.bean.WhileOddChecker;

public class CheckersDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new DoWhileOddChecker());
        thread.start();
        Thread thread1 = new Thread(new ForOddChecker());
        thread1.start();
        Thread thread2 = new Thread(new WhileOddChecker());
        thread2.start();
    }
}
