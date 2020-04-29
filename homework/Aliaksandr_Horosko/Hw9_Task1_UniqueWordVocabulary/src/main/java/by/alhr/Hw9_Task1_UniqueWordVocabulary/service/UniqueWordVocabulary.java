package by.alhr.Hw9_Task1_UniqueWordVocabulary.service;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary implements Runnable {
    public Set<String> vocabularySet = new HashSet<String>();

    public void addWord(String word) {
        if (word.isEmpty()) {
            System.out.println("Пустые слова добавляться в коллекцию не должны!");
            System.out.println();
        } else if (vocabularySet.contains(word)) {
            System.out.println("Дубликаты добавляться в коллекцию не должны!");
            System.out.println();
        } else {
            vocabularySet.add(word);
        }
    }

    public int getWordsCount() {
        System.out.println("Количество уникальных слов в коллекции = " + vocabularySet.size());
        return vocabularySet.size();
    }

    public void printVocabulary() {
        System.out.println("\n Cодержимое коллекции: ");
        for (String collectionSoderjimoe : vocabularySet){
            System.out.println(collectionSoderjimoe);
        }
    }

    @Override
    public void run() {
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
}
