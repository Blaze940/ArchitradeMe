package com.esgi.architrademe.hexagonalArchi.domain;

public enum BillStatusEnum {
    PAID("Paid"),
    UNPAID("Unpaid");

    private final String label;

    BillStatusEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
