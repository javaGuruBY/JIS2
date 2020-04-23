package by.alhr.Hw8_Task1_Animals.service;

import java.util.Objects;

public class Mammal extends Animal {
    protected String eat;
    public Mammal(String view, String eat) {
        super(view);
        this.eat = eat;
    }
    public void eatFood (String eat){
        this.eat = eat;
    }

}
