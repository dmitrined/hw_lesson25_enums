public enum MoonPhases {
    NEW_MOON(" 0%"),
    WAXING_CRESCENT(" 14.3%"),
    FIRST_QUARTER(" 42.9%"),
    WAXING_GIBBOUS(" 71.5%"),
    FULL_MOON(" 100%"),
    WANING_GIBBOUS(" 85.8%"),
    LAST_QUARTER(" 57.2%"),
    WANING_CRESCENT(" 28.6%");

    private final String description;

    MoonPhases(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}