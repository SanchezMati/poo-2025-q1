package guia7.ejercicio4;


import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker {
    private final Set<RankedBook> rankedBooks = new TreeSet<>();

    public Ranker add(Genre genre, Book book) {
        rankedBooks.add(new RankedBook(book, genre, 0));
        return this;
    }

    public void rateUp(Book book) {
        Iterator<RankedBook> iterator = rankedBooks.iterator();
        boolean found = false;
        while (iterator.hasNext() && !found) {
            RankedBook rankedBook = iterator.next();
            if (rankedBook.getBook().equals(book)) {
                iterator.remove();
                rankedBooks.add(new RankedBook(book, rankedBook.getGenre(), rankedBook.getRanking()+1));
                found = true;
            }
        }
        if(!found) {
            rankedBooks.add(new RankedBook(book));
        }
    }

    public void printRanking() {
        System.out.println("General Ranking");
        for (RankedBook rankedBook : rankedBooks) {
            System.out.println(rankedBook);
        }
    }

    public void printRanking(Genre genre) {
        System.out.println("Ranking of " + genre);
        for (RankedBook rankedBook : rankedBooks) {
            if (rankedBook.getGenre().equals(genre)) {
                System.out.println(rankedBook);
            }
        }
    }




}
