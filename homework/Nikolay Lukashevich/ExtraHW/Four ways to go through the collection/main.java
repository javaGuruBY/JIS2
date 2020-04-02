package by.lukash.Loops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ThroughTheCollection {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> integers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (Integer integer : integers) {
            if (integer.equals(5)) {
                continue;
            }
            System.out.println(integer + " Hello ");
        }
        System.out.println("------------Skip 5");

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i).equals(5)) {
                continue;
            }
            System.out.println(integers.get(i) + " Hello");
        }
        System.out.println("------------Foreach on collections");
        for (int element : array) {
            System.out.println(element + " Hello");
        }
        System.out.println("------------");

        integers.forEach(element -> System.out.println(element + " hello"));

        System.out.println("------------Skip 5_Stream");
        integers.stream()
                .filter(a -> a != 5)
                .forEach(System.out::println);
    }
}

//		SpringApplication.run(LoopsApplication.class, args);


