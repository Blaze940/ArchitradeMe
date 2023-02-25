package com.esgi.architrademe.hexagonalArchi.domain.ports.server;

import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.infrastructure.postgresql.entity.ConsultantEntity;

import java.util.Optional;

public interface Consultants {
    void add(Consultant consultant);
    Optional<ConsultantEntity> findById(ConsultantId consultantId);
    void remove(ConsultantId consultantId);
    ConsultantId nextId();
}
