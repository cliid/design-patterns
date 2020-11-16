package id.cli.bridge_pattern.resource;

import id.cli.bridge_pattern.IResource;
import id.cli.bridge_pattern.resource.things.Artist;

public class ArtistResource implements IResource {
    Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return this.artist.bio();
    }

    @Override
    public String image() {
        return this.artist.photo();
    }

    @Override
    public String title() {
        return this.artist.firstName() + " " + this.artist.lastName();
    }

    @Override
    public String url() {
        return this.artist.website();
    }
}
