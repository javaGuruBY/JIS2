package by.alhr;

import by.alhr.bean.Dog;
import by.alhr.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog frayzi = new Dog(8, "red", "Frayzi");
        Dog dodik = new Dog(5, "black", "Dodik");
        Dog klyacha = new Dog(12, "gray", "Klyacha");
        DogService dogService = new DogService();
        System.out.println("Frayzi: ");
        dogService.eat(frayzi);
        dogService.sleep(frayzi);
        System.out.println("Dodik: ");
        dogService.voice(dodik);
        System.out.println("Klyacha: ");
        dogService.eat(klyacha);
    }
}
