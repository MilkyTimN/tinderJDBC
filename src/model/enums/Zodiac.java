package model.enums;

public enum Zodiac {
    ARIES("Овен"),
    TAURUS("Телец"),
    GEMINI("Близнецы"),
    CANCER("Рак"),
    LEO("Лев"),
    VIRGO("Дева"),
    LIBRA("Весы"),
    SCORPIO("Скорпион"),
    SAGITTARIUS("Стрелец"),
    CAPRICORN("Козерог"),
    AQUARIUS("Водолей"),
    PISCES("Рыбы");

    private String description;

    Zodiac(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
