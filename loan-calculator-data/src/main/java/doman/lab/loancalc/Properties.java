package doman.lab.loancalc;

public enum Properties {
    MONTH_IN_YEAR(12),
    PERCENT(100);

    private int value;

    Properties(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
