package by.evgKor.Hw5Task3.service;

import by.evgKor.Hw5Task3.bean.Tv;

public class TvService implements Runnable {
    Tv tv;
    @Override
    public void run() {
        Tv tv = new Tv(15, 22, "Samsung", true);
        TvService tvService = new TvService();
        tvService.switchToTheNextChannel(tv);
        tvService.switchToPreviousChannel(tv);
        tvService.increaseVolume(tv);
        tvService.reduceVolume(tv);
    }

    public void switchToTheNextChannel(Tv tv) {
        if (tv.isSwitchedTvOn()) {
            System.out.println("Current channel is number " + tv.getCurrentChanel());
            tv.setCurrentChanel(tv.getCurrentChanel() + 1);
            System.out.println("Next channel is number " + tv.getCurrentChanel());
        } else {
            System.out.println("Please, switch tv on");
        }
    }


    public void switchToPreviousChannel(Tv tv) {
        if (tv.isSwitchedTvOn()) {
            System.out.println("Current channel is number " + tv.getCurrentChanel());
            tv.setCurrentChanel(tv.getCurrentChanel() - 1);
            System.out.println("previous channel is " + tv.getCurrentChanel());
        } else {
            System.out.println("Please,switch tv on");
        }
    }

    public void increaseVolume(Tv tv) {
        if (tv.isSwitchedTvOn()) {
            System.out.println("current volume is " + tv.getCurrentVolume() + "%");
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
            System.out.println("increase volume " + tv.getCurrentVolume() + "%");
        } else {
            System.out.println("Please, switch tv on");
        }
    }


    public void reduceVolume(Tv tv) {
        if (tv.isSwitchedTvOn()) {
            System.out.println("Current volume is " + tv.getCurrentVolume() + "%");
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
            System.out.println("reduce volume " + tv.getCurrentVolume() + "%");
        }

    }

    public TvService() {
    }

    public TvService(Tv tv) {

        this.tv = tv;
    }
}
