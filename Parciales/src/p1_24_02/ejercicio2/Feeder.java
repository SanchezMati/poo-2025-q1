package p1_24_02.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Feeder {
    private Article[] articles = new Article[INITIAL_DIM];
    private static final int INITIAL_DIM = 10;
    private int dim; //Espacios ocupados

    public Article addArticle(FeedType feedType, String title) {
        if (dim == articles.length) {
            resize();
        }
        articles[dim] = new Article(feedType, title);
        return articles[dim++];
    }

    private void resize() {
        articles = Arrays.copyOf(articles, dim+INITIAL_DIM);
    }

    public Article[] getArticlesCopy(Comparator<Article> comparator) {
        Article[] toReturn = Arrays.copyOf(articles, dim);
        Arrays.sort(toReturn, comparator);
        return toReturn;
    }

    public Article[] getArticlesCopy() {
        return getArticlesCopy(Comparator.naturalOrder());
    }

    public Article[] getReversedArticlesCopy() {
        return getArticlesCopy(Comparator.reverseOrder());
    }

    public Article firstUnread() {
        return firsUnread(feedType -> true);
    }

    public Article firstUnread(FeedType feedType) {
        return firsUnread(ft -> ft.equals(feedType));
    }

    public Article firsUnread(Predicate<FeedType> feedTypePredicate) {
        for(int i = 0; i < dim; i++) {
            if(feedTypePredicate.test(articles[i].getFeedType()) && articles[i].isNotRead()) {
                return articles[i];
            }
        }
        throw new IllegalArgumentException();
    }

}
