package by.serg.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable, Runnable {
    private String name;
    private String author;
    private int pagesNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, pagesNumber);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pagesNumber=" + pagesNumber +
                '}';
    }

    public Book() {
    }

    public Book(String name, String author, int pagesNumber) {
        this.name = name;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public void run() {

        Book book1 = new Book("Декамерон", "Боккаччо Джованни", 262);
        System.out.println(book1);
        Book book2 = new Book("Декамерон", "Боккаччо Джованни", 262);
        System.out.println("book1 == book2 = " + (book1.equals(book2)));
        book2.setAuthor("Анджей Сапковский");
        book2.setName("Ведьмак: Владычица озера");
        book2.setPagesNumber(348);
        System.out.println("book1 == book2 = " + (book1.equals(book2)));
    }
}
