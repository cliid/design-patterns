package id.cli.abstract_factory_pattern.product.alert;

import id.cli.abstract_factory_pattern.product.ProductAlert;

public class ProductAlertLinux implements ProductAlert {
    @Override
    public void modelName() {
        System.out.println("Model Name: Linux");
    }

    @Override
    public void alert() {
        System.out.println("Linux Alerting!!!");
    }
}
