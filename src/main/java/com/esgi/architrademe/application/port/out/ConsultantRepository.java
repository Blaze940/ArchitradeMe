package com.esgi.architrademe.application.port.out;

import com.esgi.architrademe.domain.Consultant;
import com.esgi.architrademe.domain.ConsultantId;

public interface ConsultantRepository {
    Consultant findByCaracterics(String caracteric);

    Consultant findById(ConsultantId consultantId);

    void saveConsultant(Consultant consultant);
}
