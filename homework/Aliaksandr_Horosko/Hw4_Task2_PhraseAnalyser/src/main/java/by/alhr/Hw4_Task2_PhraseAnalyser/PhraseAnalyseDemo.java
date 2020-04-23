package by.alhr.Hw4_Task2_PhraseAnalyser;

import by.alhr.Hw4_Task2_PhraseAnalyser.service.PhraseAnalyserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhraseAnalyseDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new PhraseAnalyserService());
        thread.start();

//		SpringApplication.run(PhraseAnalyserDemo.class, args);
    }
}