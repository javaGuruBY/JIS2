package com.kachenya.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String producer;
    private boolean isWork;

    public Tv() {
    }

    public Tv(int currentChannel, int currentVolume, String producer, boolean isWork) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.producer = producer;
        this.isWork = isWork;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean getWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isWork == tv.isWork &&
                Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, producer, isWork);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", producer='" + producer + '\'' +
                ", isWork=" + isWork +
                '}';
    }
}
