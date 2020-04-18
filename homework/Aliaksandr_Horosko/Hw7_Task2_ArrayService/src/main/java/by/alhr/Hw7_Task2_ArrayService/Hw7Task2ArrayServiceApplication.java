package by.alhr.Hw7_Task2_ArrayService;

import by.alhr.Hw7_Task2_ArrayService.service.ArrayService;

public class Hw7Task2ArrayServiceApplication {

    public static void main(String[] args) {
        Thread thread = new Thread(new ArrayService());
        thread.start();
    }

//		SpringApplication.run(Hw7Task2ArrayServiceApplication.class, args);
}


