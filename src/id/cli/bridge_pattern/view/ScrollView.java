package id.cli.bridge_pattern.view;

import id.cli.bridge_pattern.IResource;
import id.cli.bridge_pattern.View;

public class ScrollView implements View {
    protected IResource iResource;

    public ScrollView(IResource iResource) {
        this.iResource = iResource;
    }

    @Override
    public String show() {
        return this.iResource.snippet() + "\n" + this.iResource.title() + "\n" + this.iResource.image();
    }
}
