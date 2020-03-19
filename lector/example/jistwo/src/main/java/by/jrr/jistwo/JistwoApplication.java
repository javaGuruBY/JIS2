package by.jrr.jistwo;

import by.jrr.jistwo.service.UserService;
import by.jrr.jistwo.service.UserServiceAnother;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JistwoApplication {

    public static void main(String[] args) {
        Thread thread = new Thread(new UserService());
        thread.run();

//		SpringApplication.run(JistwoApplication.class, args);
    }
}
