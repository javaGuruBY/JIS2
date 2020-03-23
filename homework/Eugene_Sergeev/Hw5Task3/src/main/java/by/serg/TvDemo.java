package by.serg;

import by.serg.bean.Tv;

public class TvDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Tv());
        thread.start();
    }
}
