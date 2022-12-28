package com.esgi.architrademe.hexagonalArchi.domain;

public enum ModalityEnum {
    FULLPRESENCE("Full presence"),
    HALFTELEWORKING("Half teleworking"),
    FULLREMOTE("Full remote");

    private final String label;

    ModalityEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
