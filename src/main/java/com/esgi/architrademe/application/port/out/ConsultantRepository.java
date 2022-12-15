package com.esgi.architrademe.application.port.out;

import com.esgi.architrademe.domain.Consultant;
import com.esgi.architrademe.domain.ConsultantId;

import java.util.UUID;

public interface ConsultantRepository {
    Consultant findByCaracterics(String caracteric);
    Consultant findByFirstname(String firstname);
    Consultant findByConsultantId(UUID consultantId);
    ConsultantId nextId();
    Consultant findById(ConsultantId consultantId);
    void saveConsultant(Consultant consultant);
}
