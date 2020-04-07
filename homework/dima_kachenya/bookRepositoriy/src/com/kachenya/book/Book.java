package com.kachenya.book;

import java.util.Objects;

public class Book {
    private String id ;
    private String name;
    private String author;
    private int pageCount;

    public Book(String id, String name, String author, int pageCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount &&
                Objects.equals(id, book.id) &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pageCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
