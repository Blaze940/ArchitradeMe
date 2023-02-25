package com.esgi.architrademe.hexagonalArchi.infrastructure.other;

import com.esgi.architrademe.hexagonalArchi.domain.ports.server.Consultants;
import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class InMemoryConsultants implements Consultants {
    private final Map<ConsultantId, Consultant> consultants = new HashMap<>();

    @Override
    public void add(Consultant consultant) {
        consultants.put(consultant.id(), consultant);
    }

    @Override
    public Consultant findById(ConsultantId consultantId) {
        return consultants.get(consultantId);
    }

    @Override
    public void remove(ConsultantId consultantId) {
        consultants.remove(consultantId);
    }

    @Override
    public ConsultantId nextId() {
        return new ConsultantId(UUID.randomUUID());
    }
}

