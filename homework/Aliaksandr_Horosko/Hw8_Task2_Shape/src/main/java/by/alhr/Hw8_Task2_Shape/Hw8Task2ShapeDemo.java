package by.alhr.Hw8_Task2_Shape;

import by.alhr.Hw8_Task2_Shape.interfaces.Shape;
import by.alhr.Hw8_Task2_Shape.service.Circle;
import by.alhr.Hw8_Task2_Shape.service.Square;
import by.alhr.Hw8_Task2_Shape.service.Triangle;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw8Task2ShapeDemo {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Circle("Circle", 18.12);
		shapes[1] = new Square ("Square", 5.2);
		shapes[2] = new Triangle("Triangle", 3.2, 1.5, 9.8);
		shapes[3] = new Circle("Circle", 2.2);
		shapes[4] = new Square("Square", 3.3);
		for (Shape shape : shapes) {
			System.out.println(shape.getName() + " : " + shape.getArea());
		}
//		SpringApplication.run(Hw8Task2ShapeDemo.class, args);
	}

}
