public enum MoonPhases {
    NEW_MOON(" 0%"),
    WAXING_CRESCENT(" 14.3%"),
    WANING_CRESCENT(" 28.6%"),
    FIRST_QUARTER(" 42.9%"),
    LAST_QUARTER(" 57.2%"),
    WAXING_GIBBOUS(" 71.5%"),
    WANING_GIBBOUS(" 85.8%"),
    FULL_MOON(" 100%");

    private final String description;

    MoonPhases(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static MoonPhases valueOf(double percent) {
        if (percent < 0 || percent > 100) {
            return null;
        }

        if (percent == 0) {
            return NEW_MOON;
        } else if (percent <= 14.3) {
            return WAXING_CRESCENT;
        } else if (percent <= 28.6) {
            return WANING_CRESCENT;
        } else if (percent <= 42.9) {
            return FIRST_QUARTER;
        } else if (percent <= 57.2) {
            return LAST_QUARTER;
        } else if (percent <= 71.5) {
            return WAXING_GIBBOUS;
        } else if (percent < 100) {
            return WANING_GIBBOUS;
        } else {
            return FULL_MOON;
        }
    }
}