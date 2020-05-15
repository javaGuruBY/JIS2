package by.seven;

import by.seven.service.TvController;

public class TvControllerApp  {
    public static void main(String[] args) {
        Thread thread = new Thread(new TvController());
        thread.start();
    }
}
