package by.alhr.Hw7_Task2_ArrayService;

import by.alhr.Hw7_Task2_ArrayService.service.ArrayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw7Task2ArrayServiceApplication {

    public static void main(String[] args) {

        int[] array = ArrayService.create(25);
        ArrayService.printArray(array);
        ArrayService.fillRandomly(array);
        ArrayService.printArray(array);
        int sum = ArrayService.sum(array);
        System.out.println("Сумма = " + sum);
        double avg = ArrayService.avg(array);
        System.out.println("Среднее арифметическое = " + avg);
    }

//		SpringApplication.run(Hw7Task2ArrayServiceApplication.class, args);
}


