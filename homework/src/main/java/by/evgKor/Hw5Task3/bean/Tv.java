package by.evgKor.Hw5Task3.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String producer;
    private boolean switchedTvOn;

    public Tv(){

    }

    public Tv(int currentChanel, int currentVolume, String producer, boolean switchedTvOn) {
        this.currentChannel = currentChanel;
        this.currentVolume = currentVolume;
        this.producer = producer;
        this.switchedTvOn = switchedTvOn;
    }

    public int getCurrentChanel() {

        return currentChannel;
    }

    public void setCurrentChanel(int currentChannel) {
        if(switchedTvOn){
            this.currentChannel = currentChannel;
        }else {
            System.out.println("Please,switch tv on");
        }
    }

    public int getCurrentVolume()
    {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(switchedTvOn){
            this.currentVolume = currentVolume;
        }else {
            System.out.println("Please,switch tv on");
        }
    }

    public String getProducer() {

        return producer;
    }

    public void setProducer(String producer) {

        this.producer = producer;
    }

    public boolean isSwitchedTvOn() {

        return switchedTvOn;
    }

    public void setSwitchedTvOn(boolean switchedTvOn) {
        this.switchedTvOn = switchedTvOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                switchedTvOn == tv.switchedTvOn &&
                Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, producer, switchedTvOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChanel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", producer='" + producer + '\'' +
                ", switchedTvOn=" + switchedTvOn +
                '}';
    }
}
