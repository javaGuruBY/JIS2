package acya.ki.tvAndController.bean;

public class TvController implements Runnable {
    private Tv tv;

    public void turnTvOn(){
        tv.turnOn();
    }
    public void turnTvOff(){
        tv.turnOff();
    }
    public void switchToTheNextChannel() {
        tv.switchToTheNextChannel();
    }

    public void switchToTheLastChannel() {
        tv.switchToTheLastChannel();
    }

    public void increaseVolume() {
        tv.increaseVolume();
    }


    public void reduceVolume() {
       tv.reduceVolume();
    }

    public void connectWithTv(Tv tv){
        this.tv = tv;
    }


    @Override
    public void run() {
        Tv tvOne = new Tv(3, 5, "LG", true);
        TvController tvController = new TvController();
        tvController.connectWithTv(tvOne);

        tvController.switchToTheNextChannel();
        tvController.turnTvOff();
        tvController.switchToTheLastChannel();

        tvController.turnTvOn();
        tvController.increaseVolume();

        for (int i = 0; i < 10; i++){
            tvController.switchToTheNextChannel();
        }

        for (int i = 0; i < 6; i++){
            tvController.reduceVolume();
        }

    }
}
