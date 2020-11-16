package id.cli.bridge_pattern;

import id.cli.bridge_pattern.resource.ArtistResource;
import id.cli.bridge_pattern.resource.BookResource;
import id.cli.bridge_pattern.resource.things.artist.Jiwu;
import id.cli.bridge_pattern.resource.things.book.TAOCP;
import id.cli.bridge_pattern.view.LongFormView;
import id.cli.bridge_pattern.view.SnippetView;

public class Main {
    public static void main(String[] args) {
        View jiwu = new LongFormView(new ArtistResource(new Jiwu()));
        View taocp = new SnippetView(new BookResource(new TAOCP()));
        System.out.println(jiwu.show());
        System.out.println(taocp.show());

    }
}
