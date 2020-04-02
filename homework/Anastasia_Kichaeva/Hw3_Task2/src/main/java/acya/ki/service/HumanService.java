package acya.ki.service;

import acya.ki.bean.Human;

public class HumanService {
    private Human human;

    public HumanService(){

    }
    public HumanService(int age, String name){
        human.setAge(age);
        human.setName(name);
    }

    public Human getHuman(){
        return human;
    }
    public void setHuman(Human human){
        this.human = human;
    }
    public void greet(Human human){
        if (human.getName() == "Kolya"){
            System.out.println("Hello, my name is " + human.getName() + ". I'm " + human.getAge() + " years old.");
        } else System.out.println("Hi, my name is " + human.getName() + ". I'm adult, I'm " + human.getAge() + " years old!");


    }
}
