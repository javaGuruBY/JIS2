package by.evgKor;

import by.evgKor.bean.UniqueWordVocabulary;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(new UniqueWordVocabulary());
        thread.start();
    }
}
