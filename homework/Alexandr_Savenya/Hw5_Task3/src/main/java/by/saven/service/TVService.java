package by.saven.service;

import by.saven.bean.TV;

public class TVService implements Runnable {
    TV tv;

    public void switchTOTheNextChannel(TV tv) {
        if (tv.getTheTVOn()) {
            System.out.println("Текущий канал = " + tv.getCurrentChannel());
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
            System.out.println("Следущий канал = "+ tv.getCurrentChannel());
        } else {
            System.out.println("включите TV!!!");
        }

    }
    public void switchTOThePreviousChannel(TV tv) {
        if (tv.getTheTVOn()) {
            System.out.println("Текущий канал = " + tv.getCurrentChannel());
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
            System.out.println("Предидущий канал = "+ tv.getCurrentChannel());
        } else {
            System.out.println("включите TV!!!");
        }

    }
    public void turnUpTheVolume(TV tv) {
        if (tv.getTheTVOn()) {
            System.out.println("Текущая громкость = " + tv.getCurrentVolume() + " % ");
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
            System.out.println("Громче = " + tv.getCurrentVolume() + " % ");
        } else {
            System.out.println("Включите TV!!!");
        }
    }
    public void turnDownTheVolume(TV tv) {
        if (tv.getTheTVOn()) {
            System.out.println("Текущая громкость = " + tv.getCurrentVolume() + " % ");
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
            System.out.println("Тише = " + tv.getCurrentVolume() + " % ");
        } else {
            System.out.println("Включите TV!!!");
        }
    }


    @Override
    public void run() {
        TV tv = new TV(25, 30, "LG" , true );
        TVService tvService = new TVService();
        tvService.switchTOTheNextChannel(tv);
        tvService.switchTOThePreviousChannel(tv);
        tvService.turnUpTheVolume(tv);
        tvService.turnDownTheVolume(tv);
    }
}
