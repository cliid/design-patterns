package id.cli.bridge_pattern.view;

import id.cli.bridge_pattern.IResource;
import id.cli.bridge_pattern.View;

public class SnippetView implements View {
    protected IResource iResource;

    public SnippetView(IResource iResource) {
        this.iResource = iResource;
    }

    @Override
    public String show() {
        return this.iResource.snippet();
    }
}
