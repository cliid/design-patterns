package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class Shotgun implements Item {
    @Override
    public String name() {
        return "Shotgun";
    }

    @Override
    public void use() {
        System.out.println("Used Shotgun");
    }
}
