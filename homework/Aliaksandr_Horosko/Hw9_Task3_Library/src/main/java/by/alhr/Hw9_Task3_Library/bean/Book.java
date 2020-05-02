package by.alhr.Hw9_Task3_Library.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    String nameBook;
    String author;

    public Book() {
    }

    public Book(String nameBook, String author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }

    @Override
    public String toString() {
        return "Book (" +
                "name: " + nameBook +", author: " + author + ")";
    }
}
