package com.esgi.architrademe.adapter.out;

import com.esgi.architrademe.application.port.out.ConsultantRepository;
import com.esgi.architrademe.domain.Consultant;
import com.esgi.architrademe.domain.ConsultantException;
import com.esgi.architrademe.domain.ConsultantId;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class InMemoryConsultantRepository implements ConsultantRepository {
    private final Map<ConsultantId, Consultant> registry = new HashMap<>();

    @Override
    public Consultant findByCaracterics(String caracteric) {
        return null; //TODO to finish
    }

    @Override
    public Consultant findByConsultantId(UUID consultantId) {
        return null;
    }

    @Override
    public ConsultantId nextId() {
        return ConsultantId.of(UUID.randomUUID());
    }

    @Override
    public Consultant findByFirstname(String firstname) {
        return null;
    }

    @Override
    public Consultant findById(ConsultantId consultantId) {
        return registry.computeIfAbsent(consultantId,
                key -> {
                    throw ConsultantException.notFoundConsultantId(consultantId);
                });
    }

    @Override
    public void saveConsultant(Consultant consultant) {
        registry.put(consultant.id(), consultant);
    }
}
