package id.cli.bridge_pattern.view;

import id.cli.bridge_pattern.IResource;
import id.cli.bridge_pattern.View;

public class ShortFormView implements View {
    protected IResource iResource;

    public ShortFormView(IResource iResource) {
        this.iResource = iResource;
    }

    @Override
    public String show() {
        return this.iResource.snippet() + "\n" + this.iResource.title();
    }
}
