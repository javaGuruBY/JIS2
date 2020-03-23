package com.kachenya.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String author;
    private String bookName;
    private int namberPage;

    public Book() {
    }

    public Book(String author, String bookName, int namberPage) {
        this.author = author;
        this.bookName = bookName;
        this.namberPage = namberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNamberPage() {
        return namberPage;
    }

    public void setNamberPage(int namberPage) {
        this.namberPage = namberPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return namberPage == book.namberPage &&
                Objects.equals(author, book.author) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, namberPage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", namberPage=" + namberPage +
                '}';
    }
}
