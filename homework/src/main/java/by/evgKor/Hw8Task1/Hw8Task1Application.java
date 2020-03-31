package by.evgKor.Hw8Task1;

import by.evgKor.Hw8Task1.animal.bird.parrot.Parrot;
import by.evgKor.Hw8Task1.animal.mammal.cat.Cat;
import by.evgKor.Hw8Task1.animal.mammal.dog.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Hw8Task1Application {

	public static void main(String[] args) {
		Dog barsik =new Dog("Bars",true,4,6);
		barsik.eat();
		System.out.println(barsik);
		Cat tolik=new Cat("Tolik",true,4,6);
		tolik.eat();
		System.out.println(tolik);
		Parrot kesha=new Parrot("Kesha",30);
		kesha.sing();
		System.out.println(kesha);


//		SpringApplication.run(Hw8Task1Application.class, args);
	}

}
