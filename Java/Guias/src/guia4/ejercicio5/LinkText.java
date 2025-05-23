package guia4.ejercicio5;

public class LinkText implements HTMLText {
    private final String link;
    private final HTMLText text;

    public LinkText(HTMLText text, String link) {
        this.link = link;
        this.text = text;
    }

    @Override
    public String source() {
        return "<a href:%s>%s</a>".formatted(link, text);
    }

    @Override
    public String toString() {
        return source();
    }
}
