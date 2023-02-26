package com.esgi.architrademe.hexagonalArchi.domain.ports;

import com.esgi.architrademe.hexagonalArchi.domain.model.Consultant;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantId;
import com.esgi.architrademe.hexagonalArchi.domain.model.ConsultantSearchCriteria;

import java.util.List;
import java.util.Optional;

public interface Consultants {
    void add(Consultant consultant);
    Optional<Consultant> findById(ConsultantId consultantId);
    void remove(ConsultantId consultantId);
    ConsultantId nextId();
    void updateConsultant(Consultant consultant);
    List<Consultant> findByCriteria(ConsultantSearchCriteria criteria);
}
