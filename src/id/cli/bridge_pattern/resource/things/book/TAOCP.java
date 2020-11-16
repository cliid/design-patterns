package id.cli.bridge_pattern.resource.things.book;

import id.cli.bridge_pattern.resource.things.Book;

public class TAOCP implements Book {
    @Override
    public String title() {
        return "The Art Of Computer Programming";
    }

    @Override
    public String shortDescription() {
        return "A bible for C programmers";
    }

    @Override
    public String image() {
        return "TAOCP image";
    }

    @Override
    public String publisherUrl() {
        return "https://www-cs-faculty.stanford.edu/~knuth/taocp.html";
    }
}
