package by.alhr.Hw7_Task3_SortSwap;

import by.alhr.Hw7_Task3_SortSwap.service.ArrayService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw7Task3_SortSwapApplication {

    public static void main(String[] args) {
        Thread thread = new Thread(new ArrayService());
        thread.start();
    }

//		SpringApplication.run(Hw7Task2ArrayServiceApplication.class, args);
}


