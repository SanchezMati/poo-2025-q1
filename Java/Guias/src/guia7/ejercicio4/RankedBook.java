package guia7.ejercicio4;

public class RankedBook implements Comparable<RankedBook> {
    private Book book;
    private Genre genre;
    private int ranking;

    public RankedBook(Book book, Genre genre, int ranking) {
        this.book = book;
        this.genre = genre;
        this.ranking = ranking;
    }

    RankedBook(Book book) {
        this.book = book;
        this.ranking = 1;
    }

    public Genre getGenre() {
        return genre;
    }

    public Book getBook() {
        return book;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(RankedBook o) {
        int cmp = Integer.compare(o.ranking, ranking);
        if(cmp == 0) {
            cmp = book.compareTo(o.book);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "%s : %d".formatted(book, ranking);
    }
}
