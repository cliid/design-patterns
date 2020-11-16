package id.cli.observer_pattern;

import id.cli.observer_pattern.display.PhoneDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.add(phoneDisplay);
        weatherStation.alert();
        phoneDisplay.display();
    }
}
