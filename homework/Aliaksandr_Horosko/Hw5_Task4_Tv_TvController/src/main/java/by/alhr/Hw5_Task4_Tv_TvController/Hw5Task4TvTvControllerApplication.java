package by.alhr.Hw5_Task4_Tv_TvController;

import by.alhr.Hw5_Task4_Tv_TvController.service.TvControllerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw5Task4TvTvControllerApplication {

	public static void main(String[] args) {

		Thread thread = new Thread(new TvControllerService());
		thread.start();
//		SpringApplication.run(Hw5Task4TvTvControllerApplication.class, args);
	}

}
