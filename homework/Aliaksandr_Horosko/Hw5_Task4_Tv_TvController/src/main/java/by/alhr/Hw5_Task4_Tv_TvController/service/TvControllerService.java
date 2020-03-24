package by.alhr.Hw5_Task4_Tv_TvController.service;

import by.alhr.Hw5_Task4_Tv_TvController.bean.Tv;

public class TvControllerService implements Runnable {

    private Tv tv;

    public void switchToTheNextChannel(){
        tv.switchToTheNextChannel();
    }

    public void switchToThePreviousChannel(){
        tv.switchToThePreviousChannel();
    }

    public void turnUpTheVolume(){
        tv.turnUpTheVolume();
    }

    public void turnDownTheVolume(){
        tv.turnDownTheVolume();
    }

    public void connect (Tv tv){
       this.tv = tv;
    }

    @Override
    public void run() {
        Tv tv = new Tv(18, 27, "Gorizont", true);
        TvControllerService tvControllerService = new TvControllerService();
        tvControllerService.connect(tv);
        tvControllerService.switchToTheNextChannel();
        tvControllerService.turnUpTheVolume();
        tvControllerService.switchToThePreviousChannel();
        tvControllerService.turnDownTheVolume();
    }
}
