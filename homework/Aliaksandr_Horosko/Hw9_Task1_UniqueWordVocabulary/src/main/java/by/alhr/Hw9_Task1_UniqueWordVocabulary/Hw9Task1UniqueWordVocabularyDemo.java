package by.alhr.Hw9_Task1_UniqueWordVocabulary;

import by.alhr.Hw9_Task1_UniqueWordVocabulary.service.UniqueWordVocabulary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task1UniqueWordVocabularyDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new UniqueWordVocabulary());
		thread.start();
//		SpringApplication.run(Hw9Task1UniqueWordVocabularyDemo.class, args);
	}

}
