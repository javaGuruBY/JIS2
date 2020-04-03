package acya.ki;

import acya.ki.bean.LightColorDetectorBean;
import acya.ki.service.LightColorDetectorService;


public class LightColorDetectorDemo {
    public static void main(String[] args) {

    LightColorDetectorBean numberForSpectrumDemo = new LightColorDetectorBean(560);
    LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
    lightColorDetectorService.detect(numberForSpectrumDemo);
    lightColorDetectorService.resultDemo(numberForSpectrumDemo);

    }
}
