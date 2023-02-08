package com.esgi.architrademe.hexagonalArchi.domain.ports;

import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;

public interface Consultants {
    void add(Consultant consultant);
    Consultant findById(ConsultantId consultantId);
    void remove(ConsultantId consultantId);
}
