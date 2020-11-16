package id.cli.iterator_pattern;

public interface Iterator {
    boolean isDone();
    void next();
    Item currentItem();
}
