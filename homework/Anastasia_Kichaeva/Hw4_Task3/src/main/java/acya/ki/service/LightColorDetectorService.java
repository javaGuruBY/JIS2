package acya.ki.service;

import acya.ki.bean.LightColorDetectorBean;

public class LightColorDetectorService {
    private LightColorDetectorBean lightColorDetectorBean;

    public LightColorDetectorService() {
    }

    public LightColorDetectorService(LightColorDetectorBean lightColorDetectorBean) {
        this.lightColorDetectorBean = lightColorDetectorBean;
    }

    public String detect(LightColorDetectorBean lightColorDetectorBean) {
        if (lightColorDetectorBean.getWaveLength() >= 380 && lightColorDetectorBean.getWaveLength() < 450){
            return "Violet";
        } else if (lightColorDetectorBean.getWaveLength() >= 450 && lightColorDetectorBean.getWaveLength() < 495){
            return "Blue";
        } else if (lightColorDetectorBean.getWaveLength() >= 495 && lightColorDetectorBean.getWaveLength() < 570) {
            return "Green";
        } else if (lightColorDetectorBean.getWaveLength() >= 570 && lightColorDetectorBean.getWaveLength() < 590) {
            return "Yellow";
        } else if (lightColorDetectorBean.getWaveLength() >= 590 && lightColorDetectorBean.getWaveLength() < 620) {
            return "Orange";
        } else if (lightColorDetectorBean.getWaveLength() >= 620 && lightColorDetectorBean.getWaveLength() <= 750) {
            return "Red";
        } else {
            return "Invisible light";
        }

    }

    public void resultDemo(LightColorDetectorBean lightColorDetectorBean){
        if (lightColorDetectorBean.getWaveLength() >= 380 && lightColorDetectorBean.getWaveLength() < 450){
            System.out.println("Violet");
        } else if (lightColorDetectorBean.getWaveLength() >= 450 && lightColorDetectorBean.getWaveLength() < 495){
            System.out.println("Blue");
        } else if (lightColorDetectorBean.getWaveLength() >= 495 && lightColorDetectorBean.getWaveLength() < 570) {
            System.out.println("Green");
        } else if (lightColorDetectorBean.getWaveLength() >= 570 && lightColorDetectorBean.getWaveLength() < 590) {
            System.out.println("Yellow");
        } else if (lightColorDetectorBean.getWaveLength() >= 590 && lightColorDetectorBean.getWaveLength() < 620) {
            System.out.println("Orange");
        } else if (lightColorDetectorBean.getWaveLength() >= 620 && lightColorDetectorBean.getWaveLength() <= 750) {
            System.out.println("Red");
        } else {
            System.out.println("Invisible light");
        }

    }
}
