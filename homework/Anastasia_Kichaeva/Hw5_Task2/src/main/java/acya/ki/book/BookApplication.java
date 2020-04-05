package acya.ki.book;

import acya.ki.book.service.BookService;

public class BookApplication {

	public static void main(String[] args) {
		Thread thread = new Thread(new BookService());
		thread.start();
		//SpringApplication.run(BookApplication.class, args);
	}

}
