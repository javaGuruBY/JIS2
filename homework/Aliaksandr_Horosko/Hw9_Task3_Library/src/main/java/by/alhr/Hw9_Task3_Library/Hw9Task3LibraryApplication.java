package by.alhr.Hw9_Task3_Library;

import by.alhr.Hw9_Task3_Library.service.LibraryService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task3LibraryApplication {

    public static void main(String[] args) {
        Thread thread = new Thread(new LibraryService());
        thread.start();
        //		SpringApplication.run(Hw9Task3LibraryApplication.class, args);
    }
}
