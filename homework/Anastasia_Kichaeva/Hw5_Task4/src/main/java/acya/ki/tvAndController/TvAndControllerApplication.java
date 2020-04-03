package acya.ki.tvAndController;

import acya.ki.tvAndController.bean.TvController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TvAndControllerApplication {

	public static void main(String[] args) {

		Thread thread = new Thread(new TvController());
		thread.start();
		//SpringApplication.run(TvAndControllerApplication.class, args);
	}

}
