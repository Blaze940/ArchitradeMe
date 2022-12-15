package com.esgi.architrademe.domain;

public class RIB {
    String value;

    private RIB(String value) {
        this.value = value;
    }

    public static RIB of(String value){
        return new RIB(value);
    }

    public static RIB generateRIB(){
        return RIB.of("1234567898765432");
    }

    // TODO Validate RIB length

    @Override
    public String toString() {
        return "RIB{" +
                "value='" + value + '\'' +
                '}';
    }
}
