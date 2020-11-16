package id.cli.bridge_pattern.resource;

import id.cli.bridge_pattern.IResource;
import id.cli.bridge_pattern.resource.things.Book;

public class BookResource implements IResource {
    Book book;
    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String snippet() {
        return this.book.shortDescription();
    }

    @Override
    public String image() {
        return this.book.image();
    }

    @Override
    public String title() {
        return this.book.title();
    }

    @Override
    public String url() {
        return this.book.publisherUrl();
    }
}
