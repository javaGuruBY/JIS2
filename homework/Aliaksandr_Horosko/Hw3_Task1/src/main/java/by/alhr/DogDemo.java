package by.alhr;

import by.alhr.bean.Dog;
import by.alhr.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogName = new Dog(5, "Redhead", "Frayzi");
        DogService dogService = new DogService();
        dogService.voice ();
        dogService.eat ();
        dogService.sleep ();
    }
}
