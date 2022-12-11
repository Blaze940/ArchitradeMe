package com.esgi.architrademe.domain;

public class RIB {
    String value;

    private RIB(String value) {
        this.value = value;
    }

    public static RIB of(String value){
        return new RIB(value);
    }

    @Override
    public String toString() {
        return "RIB{" +
                "value='" + value + '\'' +
                '}';
    }
}
