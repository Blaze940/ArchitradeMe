package com.esgi.architrademe.hexagonalArchi.domain.model.other;

import java.util.UUID;

public final class MissionId {
    private final UUID value;

    private MissionId(UUID value) {
        this.value = value ;
    }
    public static MissionId of(UUID value) {
        return new MissionId(value);
    }
    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MissionId missionId = (MissionId) o;
        return value.equals(missionId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "MissionId{" +
                "value=" + value +
                '}';
    }

}
