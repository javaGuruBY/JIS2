package acya.ki.creditCard;

import acya.ki.creditCard.bean.CreditCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditCardApplication {

	public static void main(String[] args) {
		Thread thread = new Thread(new CreditCard());
		thread.start();

		//SpringApplication.run(CreditCardApplication.class, args);
	}

}
