package id.cli.proxy_pattern;

public class LazyBookParserProxy implements IBookParser{
    BookParser parser;
    private String book = null;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if(this.parser == null) this.parser = new BookParser(book);
        return this.parser.getNumberOfPages();
    }
}
