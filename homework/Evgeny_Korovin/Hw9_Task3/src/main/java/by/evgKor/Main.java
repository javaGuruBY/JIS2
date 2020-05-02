package by.evgKor;

import by.evgKor.bean.Book;
import by.evgKor.service.Library;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Lev Tolstoy", "War and Peace");
        Book bookTwo = new Book("Lev Tolstoy", "Anna Karenina");
        Book bookThree = new Book("Vladimir Mayakovsky", "Pro eto");
        Book bookFour = new Book("James Joyce", "Ulysses");
        Book bookFifth=new Book("Lev Tolstoy","Detstvo");
        Library library = new Library();
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);
        library.addBook(bookFifth);
        library.deleteBookFromLibrary(bookThree);
        library.findOneBookByTitle("Ulysses");
        library.findBookByAuthor("Lev Tolstoy");
    }
}
