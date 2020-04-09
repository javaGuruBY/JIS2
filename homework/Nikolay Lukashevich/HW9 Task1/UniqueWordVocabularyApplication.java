package by.lukash.UniqueWordVocabulary;

import by.lukash.UniqueWordVocabulary.bean.UniqueWordVocabulary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniqueWordVocabularyApplication {

	public static void main(String[] args) {
		Thread thread=new Thread(new UniqueWordVocabulary());
		thread.start();
	//	SpringApplication.run(UniqueWordVocabularyApplication.class, args);
	}

}
