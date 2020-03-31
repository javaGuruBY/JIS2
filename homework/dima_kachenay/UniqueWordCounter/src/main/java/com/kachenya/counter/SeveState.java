package com.kachenya.counter;

public class SeveState {
    public int countOfEnter;
    public String word;

    public SeveState(int countOfEnter) {
        this.countOfEnter = countOfEnter;
    }

    public SeveState(String word) {
        this.word = word;
    }

    public SeveState(int countOfEnter, String word) {
        this.countOfEnter = countOfEnter;
        this.word = word;
    }
}
