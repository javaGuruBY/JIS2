package by.alhr.Hw7_Task1_WorkWithArrays;

import by.alhr.Hw7_Task1_WorkWithArrays.service.LookupArrayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkWithArraysDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new LookupArrayService());
		thread.start();

//		SpringApplication.run(WorkWithArraysDemo.class, args);
	}

}
