package id.cli.proxy_pattern;

public class Main {
    public static void main(String[] args) {
        IBookParser bookParser = new LazyBookParserProxy("This is a book.");
        System.out.println(bookParser.getNumberOfPages());
    }
}
