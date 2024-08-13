package org.example.observer;

public class WeatherMonitor {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        TemperatureDisplay temperatureDisplay=new TemperatureDisplay();
        HumidityDisplay humidityDisplay=new HumidityDisplay();

        weatherData.attach(temperatureDisplay);
        weatherData.attach(humidityDisplay);

        weatherData.setWeather(25.5f,65.7f);
        weatherData.setWeather(23.9f,70.0f);

    }
}
