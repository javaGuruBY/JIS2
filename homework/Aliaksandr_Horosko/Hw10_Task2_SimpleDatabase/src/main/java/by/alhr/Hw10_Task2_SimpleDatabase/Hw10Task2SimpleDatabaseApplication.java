package by.alhr.Hw10_Task2_SimpleDatabase;

import by.alhr.Hw10_Task2_SimpleDatabase.bean.Book;
import by.alhr.Hw10_Task2_SimpleDatabase.exception.ItemNotFoundException;
import by.alhr.Hw10_Task2_SimpleDatabase.service.BookRepositoryService;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw10Task2SimpleDatabaseApplication {

    public static void main(String[] args) throws ItemNotFoundException {
        BookRepositoryService bookRepositoryService = new BookRepositoryService();
        bookRepositoryService.save(new Book("1", "Zelenaya Milya", "Stiven King", 700));
        bookRepositoryService.save(new Book("2", "Umri Segodnya", "James Piter", 830));
        bookRepositoryService.save(new Book("3", "Siyanie", "Stiven King", 589));
        bookRepositoryService.save(new Book("4", "Vse krome pravdi", "Jillian Makkallister", 798));
        System.out.println();
        bookRepositoryService.findAll();
        System.out.println();
        bookRepositoryService.findById("2");
        System.out.println();
        bookRepositoryService.delete("5");

//		SpringApplication.run(Hw10Task2SimpleDatabaseApplication.class, args);
    }
}
