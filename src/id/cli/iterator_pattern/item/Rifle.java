package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class Rifle implements Item {
    @Override
    public String name() {
        return "Rifle";
    }

    @Override
    public void use() {
        System.out.println("Used Rifle");
    }
}
