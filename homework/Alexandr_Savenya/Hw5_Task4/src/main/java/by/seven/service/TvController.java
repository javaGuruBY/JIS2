package by.seven.service;

import by.seven.bean.TV;

public class TvController implements Runnable {
    private TV tv;

    public void switchTOTheNextChannel() {
        tv.switchTOTheNextChannel();
    }
    public void switchTOThePreviousChannel() {
        tv.switchTOThePreviousChannel();
    }
    public void turnUpTheVolume() {
        tv.turnUpTheVolume();
    }
    public void turnDownTheVolume() {
        tv.turnDownTheVolume();
    }


    @Override
    public void run() {
        TV tv = new TV(25, 30, "LG" , true );
        TvController tvController = new TvController();
        tv.switchTOTheNextChannel();
        tv.switchTOThePreviousChannel();
        tv.turnUpTheVolume();
        tv.turnDownTheVolume();

    }
}
