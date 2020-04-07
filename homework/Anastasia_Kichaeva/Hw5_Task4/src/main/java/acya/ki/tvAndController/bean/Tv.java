package acya.ki.tvAndController.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean isOn;

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Tv() {
    }

    public Tv(int currentChannel, int currentVolume, String manufacturer, boolean isOn) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.manufacturer = manufacturer;
        this.isOn = isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isOn() {
        return isOn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tv)) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isOn == tv.isOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, isOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    public void switchToTheNextChannel() {
        if (isOn) {
            currentChannel += 1;
            System.out.println("Channel is : " + currentChannel);
        } else {
            System.out.println("Tv is off");
        }

    }

    public void switchToTheLastChannel() {
        if (isOn) {
            currentChannel -= 1;
            System.out.println("Channel is : " + currentChannel);
        } else {
            System.out.println("Tv is off");
        }
    }

    public void increaseVolume() {
        if (isOn) {
            currentVolume += 1;
            System.out.println("Volume is : " + currentVolume);
        } else {
            System.out.println("Tv is off");
        }
    }


    public void reduceVolume() {
        if (isOn) {
            currentVolume -= 1;
            System.out.println("Volume is : " + currentVolume);
        } else {
            System.out.println("Tv is off");
        }
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}