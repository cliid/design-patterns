package id.cli.abstract_factory_pattern.product.alert;

import id.cli.abstract_factory_pattern.product.ProductAlert;

public class ProductAlertMac implements ProductAlert {
    @Override
    public void modelName() {
        System.out.println("Model Name: macOS");
    }

    @Override
    public void alert() {
        System.out.println("macOS Alerting!!!");
    }
}
