package id.cli.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ITodoTree> todoTreeList1 = new ArrayList<>();
        todoTreeList1.add(new Todo("Make a game"));
        todoTreeList1.add(new Todo("Play fortnite"));
        List<ITodoTree> todoTreeList = new ArrayList<>();
        todoTreeList.add(new Todo("Make a language"));
        todoTreeList.add(new Todo("Play league of legends"));
        todoTreeList.add(new Project("School stuff", todoTreeList1));
        ITodoTree todoTree = new Project("Title 1", todoTreeList);
        System.out.println(todoTree.getHtml());
    }
}
