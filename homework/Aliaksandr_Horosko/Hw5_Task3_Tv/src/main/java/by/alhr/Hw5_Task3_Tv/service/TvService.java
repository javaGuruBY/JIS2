package by.alhr.Hw5_Task3_Tv.service;

import by.alhr.Hw5_Task3_Tv.bean.Tv;

import java.util.Objects;

public class TvService implements Runnable {

    Tv tv;

    public void switchToTheNextChannel(Tv tv) {
        if (tv.getTheTVOn()) {
            System.out.println("текущий канал = " + tv.getCurrentChannel());
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
            System.out.println("следующий канал = " + tv.getCurrentChannel());
        } else {
            System.out.println("включите TV!!!");
        }
    }

    public void switchToThePreviousChannel(Tv tv) {
        if (tv.getTheTVOn()) {
            System.out.println("текущий канал = " + tv.getCurrentChannel());
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
            System.out.println("предедущий канал = " + tv.getCurrentChannel());
        } else {
            System.out.println("включите TV!!!");
        }
    }

    public void turnUpTheVolume(Tv tv) {
        if (tv.getTheTVOn()) {
            System.out.println("текущая громкость = " + tv.getCurrentVolume() + " %");
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
            System.out.println("ГРОМЧЕ = " + tv.getCurrentVolume() + " %");
        } else {
            System.out.println("включите TV!!!");
        }

    }

    public void turnDownTheVolume(Tv tv) {
        if (tv.getTheTVOn()) {
            System.out.println("текущая громкость = " + tv.getCurrentVolume() + " %");
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
            System.out.println("ТИШЕ = " + tv.getCurrentVolume()+ " %");
        } else {
            System.out.println("включите TV!!!");
        }

    }

    @Override
    public void run() {
        Tv tv = new Tv(18, 27, "Gorizont", true);
        TvService tvService = new TvService();
        tvService.switchToTheNextChannel(tv);
        tvService.switchToThePreviousChannel(tv);
        tvService.turnUpTheVolume(tv);
        tvService.turnDownTheVolume(tv);

    }
}
