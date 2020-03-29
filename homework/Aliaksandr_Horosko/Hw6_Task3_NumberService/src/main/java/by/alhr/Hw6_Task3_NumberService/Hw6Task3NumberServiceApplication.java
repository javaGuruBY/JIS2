package by.alhr.Hw6_Task3_NumberService;

import by.alhr.Hw6_Task3_NumberService.service.NumberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw6Task3NumberServiceApplication {

	public static void main(String[] args) {
		System.out.println("NumberService.rangeSum(7,3) = " + NumberService.rangeSum(7, 3));
		System.out.println("NumberService.rangeEvenCount(2,8) = " + NumberService.rangeEvenCount(2, 8));
//		SpringApplication.run(Hw6Task3NumberServiceApplication.class, args);
	}

}
