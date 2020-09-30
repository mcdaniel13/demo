package com.example.demo.model;

import java.util.List;

public class CurrentWeatherModel {
    private List<Weather> weather;
    private Main main;
    private Wind wind;
    private Sys sys;

    public List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public Sys getSys() {
        return sys;
    }

    public static class Weather {
        private String main;
        private String description;

        public String getMain() {
            return main;
        }

        public String getDescription() {
            return description;
        }
    }

    public static class Main {
        private double temp;
        private double temp_min;
        private double temp_max;
        private double humidity;

        public double getTemp() {
            return temp;
        }

        public double getTemp_min() {
            return temp_min;
        }

        public double getTemp_max() {
            return temp_max;
        }

        public double getHumidity() {
            return humidity;
        }
    }

    public static class Wind {
        private double speed;

        public double getSpeed() {
            return speed;
        }
    }

    public static class Sys {
        private String country;

        public String getCountry() {
            return country;
        }
    }
}

/*

{
    coord: {
        lon: 126.98,
        lat: 37.57
    },
    weather: [
        {
            id: 803,
            main: "Clouds",
            description: "broken clouds",
            icon: "04n"
        }
    ],
    base: "stations",
    main: {
        temp: 292.35,
        feels_like: 294.77,
        temp_min: 291.15,
        temp_max: 293.15,
        pressure: 1010,
        humidity: 93
    },
    visibility: 10000,
    wind: {
        speed: 0.56,
        deg: 57
    },
    rain: {
        1h: 0.1
    },
    clouds: {
        all: 75
    },
    dt: 1601466010,
    sys: {
        type: 1,
        id: 8117,
        country: "KR",
        sunrise: 1601414793,
        sunset: 1601457448
    },
    timezone: 32400,
    id: 1835848,
    name: "Seoul",
    cod: 200
}

*/
