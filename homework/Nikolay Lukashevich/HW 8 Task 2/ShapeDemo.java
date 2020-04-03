package by.lukash.Shape;

import by.lukash.Shape.bean.AbstractShape;
import by.lukash.Shape.bean.Circle;
import by.lukash.Shape.bean.Square;
import by.lukash.Shape.bean.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShapeDemo {

	public static void main(String[] args) {
//		SpringApplication.run(ShapeDemo.class, args);
		AbstractShape[] abstractShapes = new AbstractShape[3];
		abstractShapes[0] = new Circle("First Circle", "black",4);
		abstractShapes[1] = new Square("First Square", "white", 4.4);
		abstractShapes[2] = new Triangle("First Triangle", "pink", 4, 4, 6);
		for (AbstractShape array : abstractShapes) {
			System.out.println(array.getName() + " : " + array.getArea() + ",color is "+array.getColor());
		}

	}
}
