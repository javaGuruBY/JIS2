package by.lukash.Library;

import by.lukash.Library.bean.Book;
import by.lukash.Library.bean.Library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		Book book1 = new Book("Author1", "Book1");
		Book book2 = new Book("Author2", "Book2");
		Book book3 = new Book("Author3", "Book3");
		Book book4 = new Book("Author4", "Book4");
		Library library = new Library();
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.deleteBook(book1);
		System.out.println(library.findBookByName("Book3"));
		System.out.println(library.findBookByAuthor("Author4"));
	}

//		SpringApplication.run(LibraryApplication.class, args);
}


