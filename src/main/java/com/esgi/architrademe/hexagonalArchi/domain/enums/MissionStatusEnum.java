package com.esgi.architrademe.hexagonalArchi.domain.enums;

public enum MissionStatusEnum {
    UNSTARTED("Unstarted"),
    INPROGRESS("In progress"),
    FINISHED("Finished");

    private final String label;

    MissionStatusEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
