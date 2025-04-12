package guia4.ejercicio5;

public class FormatText implements HTMLText {
    private final HTMLText text;
    private final String format;

    public FormatText(HTMLText text, String format) {
        this.text = text;
        this.format = format;
    }

    @Override
    public String source() {
        return "<%s>%s</%s>".formatted(format, text, format);
    }

    @Override
    public String toString() {
        return source();
    }
}
