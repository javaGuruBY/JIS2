package acya.ki.tv;

import acya.ki.tv.bean.Tv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TvApplication {

	public static void main(String[] args) {

		Thread thread = new Thread(new Tv());
		thread.start();
		//SpringApplication.run(TvApplication.class, args);
	}

}
