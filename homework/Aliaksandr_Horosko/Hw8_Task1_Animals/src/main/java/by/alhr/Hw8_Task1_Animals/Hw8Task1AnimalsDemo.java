package by.alhr.Hw8_Task1_Animals;

import by.alhr.Hw8_Task1_Animals.service.Cat;
import by.alhr.Hw8_Task1_Animals.service.Dog;
import by.alhr.Hw8_Task1_Animals.service.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw8Task1AnimalsDemo {

	public static void main(String[] args) {
		Parrot parrot = new Parrot("Bird", 20, "Яша");
		System.out.println(parrot.toString());
		System.out.println();
		Dog dog = new Dog("Mammal", "Meat", "Frayzi");
		System.out.println(dog.toString());
		System.out.println();
		Cat cat = new Cat("Mammal", "Fish", "Tayra");
		System.out.println(cat.toString());
//		SpringApplication.run(Hw8Task1AnimalsDemo.class, args);
	}

}
