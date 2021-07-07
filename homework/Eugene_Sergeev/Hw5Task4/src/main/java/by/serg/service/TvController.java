package by.serg.service;

import by.serg.bean.Tv;

public class TvController implements Runnable {
    private Tv tv;

    public void turnTvOn() {
        tv.turnOn();
    }

    public void turnTvOff() {
        tv.turnOff();
    }

    public void selectNextChannel() {
        tv.selectNextChannel();
    }

    public void selectPreviousChannel() {
        tv.selectPreviousChannel();
    }

    public void increaseVolume() {
        tv.increaseVolume();
    }

    public void decreaseVolume() {
        tv.decreaseVolume();
    }

    public void connectToTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        Tv tv = new Tv("LG");
        TvController tvController = new TvController();
        tvController.connectToTv(tv);
        tvController.turnTvOn();
        for (int i = 0; i < 20; i++) {
            tvController.selectNextChannel();
        }
        for (int i = 0; i < 10; i++) {
            tvController.increaseVolume();
        }
    }
}
