package by.alhr.Hw7_Task5_CopyRange;

import by.alhr.Hw7_Task5_CopyRange.service.Copy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw7Task5CopyRangeDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new Copy());
		thread.start();
//		SpringApplication.run(Hw7Task5CopyRangeDemo.class, args);
	}

}
