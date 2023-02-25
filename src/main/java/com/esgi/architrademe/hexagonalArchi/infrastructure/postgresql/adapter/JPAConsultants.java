package com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.adapter;

import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.ports.server.Consultants;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.repository.ConsultantEntityRepository;

import java.util.UUID;

public class JPAConsultants implements Consultants {
    ConsultantEntityRepository consultantRepository;

    public JPAConsultants(ConsultantEntityRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }

    @Override
    public void add(Consultant consultant) {

    }

    @Override
    public Consultant findById(ConsultantId consultantId) {
        return null;
    }

    @Override
    public void remove(ConsultantId consultantId) {

    }

    @Override
    public ConsultantId nextId() {
        return new ConsultantId(UUID.randomUUID());
    }
}
