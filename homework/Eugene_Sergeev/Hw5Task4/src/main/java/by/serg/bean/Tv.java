package by.serg.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable {
    private int currentChannel = 1;
    private int currentVolume = 0;
    private String producer;
    private boolean isTurnedOn;


    public void selectNextChannel() {
        if (isTurnedOn) {
            currentChannel += 1;
            System.out.println("Channel = " + currentChannel);
        }
    }

    public void selectPreviousChannel() {
        if (isTurnedOn) {
            currentChannel -= 1;
            System.out.println("Channel = " + currentChannel);
        }
    }

    public void increaseVolume() {
        if (isTurnedOn) {
            currentVolume += 1;
            System.out.println("Volume = " + currentVolume);
        }
    }

    public void decreaseVolume() {
        if (isTurnedOn) {
            currentVolume -= 1;
            System.out.println("Volume = " + currentVolume);
        }
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }

    public Tv(String producer) {
        this.producer = producer;
    }

    public Tv() {
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isTurnedOn == tv.isTurnedOn &&
                Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, producer, isTurnedOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", producer='" + producer + '\'' +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }

}
