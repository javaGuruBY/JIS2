package by.alhr.Hw6_Task1_OddNumberTable;

import by.alhr.Hw6_Task1_OddNumberTable.bean.DoWhileOddChecker;
import by.alhr.Hw6_Task1_OddNumberTable.bean.ForOddChecker;
import by.alhr.Hw6_Task1_OddNumberTable.bean.WhileOddChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw6Task1OddNumberTableApplication {

	public static void main(String[] args) {

		Thread thread = new Thread(new DoWhileOddChecker());
		thread.run();

		Thread thread1 = new Thread(new ForOddChecker());
		thread1.run();

		Thread thread2 = new Thread(new WhileOddChecker());
		thread2.run();

//		SpringApplication.run(Hw6Task1OddNumberTableApplication.class, args);
	}

}
