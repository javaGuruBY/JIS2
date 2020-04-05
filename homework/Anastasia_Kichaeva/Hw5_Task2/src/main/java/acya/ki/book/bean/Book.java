package acya.ki.book.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

    private String author;
    private String name;
    private int numberOfPage;

    public Book() {
    }

    public Book(String author, String name, int numberOfPage) {
        this.author = author;
        this.name = name;
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return numberOfPage == book.numberOfPage &&
                Objects.equals(author, book.author) &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, numberOfPage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
