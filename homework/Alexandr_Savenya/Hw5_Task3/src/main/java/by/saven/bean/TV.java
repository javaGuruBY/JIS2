package by.saven.bean;

import java.io.Serializable;
import java.util.Objects;

public class TV implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private Boolean isTheTVOn;


    public TV() {
    }

    public TV(int currentChannel, int currentVolume, String manufacturer, Boolean isTheTVOn) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.manufacturer = manufacturer;
        this.isTheTVOn = isTheTVOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getTheTVOn() {
        return isTheTVOn;
    }

    public void setTheTVOn(Boolean theTVOn) {
        isTheTVOn = theTVOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                Objects.equals(manufacturer, tv.manufacturer) &&
                Objects.equals(isTheTVOn, tv.isTheTVOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, isTheTVOn);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isTheTVOn=" + isTheTVOn +
                '}';
    }
}
