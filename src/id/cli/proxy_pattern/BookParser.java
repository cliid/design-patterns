package id.cli.proxy_pattern;

public class BookParser implements IBookParser{
    private String book;

    public BookParser(String book) {
        // some expensive parsing.
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        return 10;
    }
}
