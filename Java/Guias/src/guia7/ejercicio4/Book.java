package guia7.ejercicio4;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        int cmp = name.compareTo(o.name);
        if (cmp == 0) {
            cmp = author.compareTo(author);
        }
        return cmp;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Book book &&
                name.equals(book.name) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return name;
    }
}
