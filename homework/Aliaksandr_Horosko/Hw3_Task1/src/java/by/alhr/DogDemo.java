package by.alhr;

import by.alhr.bean.Dog;
import by.alhr.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog nameDog = new Dog (8, "red", "Frayzi");
        DogService dogService = new DogService();
        dogService.voice();
        dogService.eat();
        dogService.sleep();
    }
}
