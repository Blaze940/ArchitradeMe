package com.esgi.architrademe.hexagonalArchi.domain.ports.server;

import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;

public interface Consultants {
    void add(Consultant consultant);
    Consultant findById(ConsultantId consultantId);
    void remove(ConsultantId consultantId);
    ConsultantId nextId();
}
