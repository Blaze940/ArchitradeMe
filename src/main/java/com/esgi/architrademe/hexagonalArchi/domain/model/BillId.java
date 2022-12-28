package com.esgi.architrademe.hexagonalArchi.domain.model;

import java.util.UUID;

public final class BillId {
    private final UUID value ;

    private BillId(UUID value) {
        this.value = value ;
    }
    public static BillId of(UUID value) {
        return new BillId(value);
    }
    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillId billId = (BillId) o;
        return value.equals(billId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "BillId{" +
                "value=" + value +
                '}';
    }
}
