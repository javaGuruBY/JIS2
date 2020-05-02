package by.evgKor.bean;

import java.util.Objects;

public class Book {
    private String bookAuthor;
    private String bookName;

    public Book(String bookAuthor, String bookName) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }


    public String getBookName() {
        return bookName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookAuthor, bookName);
    }

    @Override
    public String toString() {
        return "{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
