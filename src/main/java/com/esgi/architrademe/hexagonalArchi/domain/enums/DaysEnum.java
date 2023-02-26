package com.esgi.architrademe.hexagonalArchi.domain.enums;

public enum DaysEnum {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    public final String label;

    DaysEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
