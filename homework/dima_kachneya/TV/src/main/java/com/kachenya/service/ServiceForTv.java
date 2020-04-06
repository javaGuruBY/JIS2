package com.kachenya.service;

import com.kachenya.bean.Tv;

public class ServiceForTv {
    private Tv tv;

    public ServiceForTv() {
        tv = new Tv();
    }

    public ServiceForTv(int currentChannel, int currentVolume, String producer, boolean isWork) {
        tv = new Tv(currentChannel, currentVolume,  producer, isWork);
    }

    public Tv getTv() {
        return tv;
    }

    public void nextChannel() {
        if (tv.getWork()) {
            tv.setCurrentChannel(tv.getCurrentVolume() + 1);
        } else {
            System.out.println("Телевизор выключен");
        }
    }

    public void predChannel() {
        if (tv.getWork()) {
            tv.setCurrentChannel(tv.getCurrentVolume() - 1);
        } else {
            System.out.println("Телевизор выключен");
        }
    }

    public void volumeUp() {
        if (tv.getWork()) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        } else {
            System.out.println("Телевизор выключен");
        }
    }

    public void volumDown() {
        if (tv.getWork()) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        } else {
            System.out.println("Телевизор выключен");
        }
    }

    public void turnOnTv() {
        tv.setWork(true);
    }

    public void switchOffTv() {
        tv.setWork(false);
    }
}

