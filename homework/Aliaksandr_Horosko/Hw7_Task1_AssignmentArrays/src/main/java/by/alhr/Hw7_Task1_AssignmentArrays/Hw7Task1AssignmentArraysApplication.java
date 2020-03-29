package by.alhr.Hw7_Task1_AssignmentArrays;

import by.alhr.Hw7_Task1_AssignmentArrays.service.LookupArrayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw7Task1AssignmentArraysApplication {

	public static void main(String[] args) {

		Thread thread = new Thread(new LookupArrayService());
		thread.start();

//		SpringApplication.run(Hw7Task1AssignmentArraysApplication.class, args);
	}

}
