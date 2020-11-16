package id.cli.bridge_pattern.resource.things.artist;

import id.cli.bridge_pattern.resource.things.Artist;

public class Jiwu implements Artist {
    public String bio() {
        return "Junior programmer who loves elegant Java code.";
    }

    public String firstName() {
        return "Jiwu";
    }

    public String lastName() {
        return "Jang";
    }

    public String website() {
        return "https://cli.id";
    }

    public String photo() {
        return "Jiwu's Photo";
    }
}
