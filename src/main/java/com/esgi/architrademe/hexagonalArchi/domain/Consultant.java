package com.esgi.architrademe.hexagonalArchi.domain;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class Consultant {
    private final ConsultantId id;


    //private final List<Event> recordedEvents;

    public Consultant(ConsultantId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consultant that = (Consultant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + id +
                '}';
    }
}
