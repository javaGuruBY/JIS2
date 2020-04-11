package by.alhr.Hw4_Task3_ColorDetector.service;

import by.alhr.Hw4_Task3_ColorDetector.bean.LightColorDetector;


import java.util.Scanner;

public class LightColorDetectorService implements Runnable {
    Scanner scanner = new Scanner(System.in);

    public String detect(LightColorDetector lightColorDetector) {
        String c = "Color: ";

        while (true) {
            if (lightColorDetector.getWavelength() >= 380 && lightColorDetector.getWavelength() <= 449) {
                System.out.println(c + "Violet");
                return null;
            } else if (lightColorDetector.getWavelength() >= 450 && lightColorDetector.getWavelength() <= 494) {
                System.out.println(c + "Blue");
                return null;
            } else if (lightColorDetector.getWavelength() >= 495 && lightColorDetector.getWavelength() <= 569) {
                System.out.println(c + "Green");
                return null;
            } else if (lightColorDetector.getWavelength() >= 570 && lightColorDetector.getWavelength() <= 589) {
                System.out.println(c + "Yellow");
                return null;
            } else if (lightColorDetector.getWavelength() >= 590 && lightColorDetector.getWavelength() <= 619) {
                System.out.println(c + "Orange");
                return null;
            } else if (lightColorDetector.getWavelength() >= 620 && lightColorDetector.getWavelength() <= 750) {
                System.out.println(c + "Red");
                return null;
            } else {
                System.out.println("Invisible Light \n Enter the wavelength: ");
                lightColorDetector.setWavelength(scanner.nextInt());
                continue;
            }

        }


    }

    @Override
    public void run() {

        System.out.println("Enter the wavelength: ");
        LightColorDetector lightColorDetector = new LightColorDetector(scanner.nextInt());
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetectorService.detect(lightColorDetector);


    }

}
