package com.esgi.architrademe.hexagonalArchi.domain.model;

import java.util.Objects;
import java.util.UUID;

public final class ConsultantId {
        private final UUID value;

        public ConsultantId(UUID value) {
            this.value = value ;
        }
        public static ConsultantId of(UUID value) {
            return new ConsultantId(value);
        }
        public String value() {
            return value.toString();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultantId consultantId = (ConsultantId) o;
        return value.equals(consultantId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ConsultantId{" +
                "value=" + value +
                '}';
    }
}
