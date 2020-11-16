package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class Arrow implements Item {
    @Override
    public String name() {
        return "Arrow";
    }

    @Override
    public void use() {
        System.out.println("Used Arrow");
    }
}
