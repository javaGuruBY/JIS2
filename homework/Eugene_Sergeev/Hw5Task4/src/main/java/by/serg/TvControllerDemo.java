package by.serg;

import by.serg.bean.Tv;
import by.serg.service.TvController;

public class TvControllerDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new TvController());
        thread.start();
    }
}
