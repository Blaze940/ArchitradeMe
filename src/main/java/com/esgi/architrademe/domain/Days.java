package com.esgi.architrademe.domain;

public enum Days {
    monday("monday"),
    tuesday("tuesday"),
    wednesday("wednesday"),
    thrusday("thrusday"),
    friday("friday"),
    saturday("saturday"),
    sunday("saturday");
    public final String label;

    private Days(String label) {
        this.label = label;
    }
}
