package p1_24_02.ejercicio2;

public class Article implements Comparable<Article> {
    private final FeedType feedType;
    private final String title;
    private boolean readStatus;

    public Article(FeedType feedType, String title) {
        this.feedType = feedType;
        this.title = title;
        this.readStatus = false;
    }

    public void read() {
        readStatus = true;
    }

    public boolean isNotRead() {
        return !readStatus;
    }

    public FeedType getFeedType() {
        return feedType;
    }

    @Override
    public int compareTo(Article o) {
        int cmp = feedType.compareTo(o.feedType);
        if(cmp == 0) {
            cmp = title.compareTo(o.title);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "%s %s is %s".formatted(feedType, title, readStatus ? "read" : "unread");
    }
}
