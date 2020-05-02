package by.alhr.Hw9_Task3_Library;

import by.alhr.Hw9_Task3_Library.bean.Book;
import by.alhr.Hw9_Task3_Library.service.LibraryService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw9Task3LibraryApplication {

    public static void main(String[] args) {
        Book book1 = new Book("Zelenaya Milya", "Stiven King");
        Book book2 = new Book("Umri Segodnya", "James Piter");
        Book book3 = new Book("Siyanie", "Stiven King");
        Book book4 = new Book("Vse krome pravdi", "Jillian Makkallister");
        Book book5 = new Book("Vse ", "Kto-to");
        Book book6 = new Book("Escho odna", "Jillian Makkallister");

        LibraryService library = new LibraryService();

        library.addBookInLibrary(book1);
        library.addBookInLibrary(book2);
        library.addBookInLibrary(book3);
        library.addBookInLibrary(book4);
        library.addBookInLibrary(book5);
        library.addBookInLibrary(book6);

        library.findByName("Umri Segodnya");
        library.findByAuthor("Jillian Makkallister");

        library.deleteBookFromLibrary(book3);
        //		SpringApplication.run(Hw9Task3LibraryApplication.class, args);
    }
}
