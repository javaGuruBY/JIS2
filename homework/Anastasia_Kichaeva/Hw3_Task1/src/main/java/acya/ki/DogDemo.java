package acya.ki;

import acya.ki.bean.Dog;
import acya.ki.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog(7, "Josef", "white");
        Dog secondDog = new Dog(10, "Grisha", "black");
        DogService dogService = new DogService();
        dogService.voice(firstDog);
        dogService.eat(secondDog);
        dogService.sleep(firstDog);
    }
}
