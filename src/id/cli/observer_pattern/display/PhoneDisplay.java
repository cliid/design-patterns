package id.cli.observer_pattern.display;

import id.cli.observer_pattern.IObserver;
import id.cli.observer_pattern.WeatherStation;

public class PhoneDisplay implements IObserver {
    private int currentTemperature;
    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    WeatherStation weatherStation;

    @Override
    public void update() {
        currentTemperature = weatherStation.getTemperature();
    }

    public void display() {
        System.out.println("Phone Display: " + currentTemperature);
    }
}
