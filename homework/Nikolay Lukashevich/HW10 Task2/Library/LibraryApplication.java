package by.lukash.Library;

import by.lukash.Library.Exception.ItemNotFoundException;
import by.lukash.Library.bean.Book;
import by.lukash.Library.repository.Library;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {


	public static void main(String[] args) throws ItemNotFoundException {

		Library library = new Library();
		Book book1 = new Book("1", "book1", "author1", 1000);
		Book book2 = new Book("2", "book2", "author1", 300);
		Book book3 = new Book("3", "book3", "author1", 500);
		Book book4 = new Book("4", "book4", "author1", 841);
		library.save(book1);
		library.save(book2);
		library.save(book3);
		library.save(book4);
		library.findAll();
		library.findById("2");
		library.delete("4");

	}

//		SpringApplication.run(LibraryApplication.class, args);
}


