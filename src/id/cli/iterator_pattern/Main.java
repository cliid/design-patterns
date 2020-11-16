package id.cli.iterator_pattern;

import id.cli.iterator_pattern.item.Shotgun;
import id.cli.iterator_pattern.item.Sword;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new HandHeldInventory(new Shotgun(), new Sword());
        Iterator iterator = inventory.getIterator();
        while (!iterator.isDone()) {
            Item currentItem = iterator.currentItem();
            System.out.println(currentItem.name());
            currentItem.use();
            iterator.next();
        }
    }
}
