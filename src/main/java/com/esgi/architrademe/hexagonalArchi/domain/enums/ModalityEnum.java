package com.esgi.architrademe.hexagonalArchi.domain.enums;

public enum ModalityEnum {
    FULLPRESENCE("Full presence"),
    HALFTELEWORKING("Half teleworking"),
    FULLREMOTE("Full remote");

    public String label;

    ModalityEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
