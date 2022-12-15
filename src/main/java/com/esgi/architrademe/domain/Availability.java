package com.esgi.architrademe.domain;

import java.util.Arrays;

public class Availability {
    String[] availableDays;

    private Availability(String[] availableDays) {
        this.availableDays = availableDays;
    }

    public static Availability of(String[] availableDays){
        return new Availability(availableDays);
    }

    public static Availability generateAvaibility(){
        return Availability.of(new String[]{Days.thrusday.label});
    }

    @Override
    public String toString() {
        return "Availability{" +
                "availableDays=" + Arrays.toString(availableDays) +
                '}';
    }
}
