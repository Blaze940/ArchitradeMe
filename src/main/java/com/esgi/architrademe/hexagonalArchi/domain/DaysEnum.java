package com.esgi.architrademe.hexagonalArchi.domain;

public enum DaysEnum {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String label;

    DaysEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
