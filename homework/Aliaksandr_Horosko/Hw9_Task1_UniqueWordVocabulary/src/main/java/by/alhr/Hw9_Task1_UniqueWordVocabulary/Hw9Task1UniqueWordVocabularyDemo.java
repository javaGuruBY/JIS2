package by.alhr.Hw9_Task1_UniqueWordVocabulary;

import by.alhr.Hw9_Task1_UniqueWordVocabulary.service.UniqueWordVocabulary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task1UniqueWordVocabularyDemo {

    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord("Sasha");
        uniqueWordVocabulary.addWord("Dima");
        uniqueWordVocabulary.addWord("Oleg");
        uniqueWordVocabulary.addWord("");
        uniqueWordVocabulary.addWord("Olga");
        uniqueWordVocabulary.addWord("Dima");
        uniqueWordVocabulary.addWord("Sveta");

        uniqueWordVocabulary.getWordsCount();
        uniqueWordVocabulary.printVocabulary();
    }
//		SpringApplication.run(Hw9Task1UniqueWordVocabularyDemo.class, args);
}
