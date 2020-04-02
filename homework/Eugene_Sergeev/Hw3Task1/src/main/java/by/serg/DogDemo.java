package by.serg;

import by.serg.bean.Dog;
import by.serg.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog tuzik = new Dog(7, "Black", "Tuzik");
        Dog bobik = new Dog();
        DogService dogService = new DogService();
        dogService.voice(tuzik);
        dogService.eat(bobik);
        dogService.sleep(tuzik);
        }
    }
