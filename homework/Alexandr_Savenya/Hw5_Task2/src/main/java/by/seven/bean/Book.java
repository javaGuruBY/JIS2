package by.seven.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String author;
    private String nameBook;
    private int numPageBook;

    public Book() {
    }

    public Book(String author, String nameBook, int numPageBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.numPageBook = numPageBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumPageBook() {
        return numPageBook;
    }

    public void setNumPageBook(int numPageBook) {
        this.numPageBook = numPageBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numPageBook == book.numPageBook &&
                Objects.equals(author, book.author) &&
                Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, numPageBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", numPageBook=" + numPageBook +
                '}';
    }
}
