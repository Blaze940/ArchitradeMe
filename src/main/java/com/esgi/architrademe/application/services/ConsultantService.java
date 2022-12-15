package com.esgi.architrademe.application.services;

import com.esgi.architrademe.application.port.out.ConsultantRepository;
import com.esgi.architrademe.domain.*;

import java.util.Objects;
import java.util.UUID;


public class ConsultantService {

    private final ConsultantRepository consultantRepository;

    public ConsultantService(ConsultantRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }

    public Consultant[] searchOnCriteria(String fieldName, String fieldValue){
        return null;
    }

    public void addConsultant(Consultant consultant){
        this.consultantRepository.saveConsultant(consultant);
    }

    public ConsultantId createConsultant(String firstname, String lastname, Skills skills, ADR adr, RIB rib, Availability availabilities) {
        ConsultantId consultantId = this.consultantRepository.nextId();
        // TODO all create consultants checks
        checkCreateConsultantAction(rib);

        Consultant consultant = new Consultant(
                consultantId=consultantId,
                skills=skills,
                adr= adr,
                rib= rib,
                firstname=firstname,
                lastname=lastname,
                availabilities=availabilities
        );
        this.consultantRepository.saveConsultant(consultant);
        return consultantId;
    }

    private void checkCreateConsultantAction(RIB rib) {
        Objects.requireNonNull(rib);
    }
}
