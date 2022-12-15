package com.esgi.architrademe.adapter.in;

import com.esgi.architrademe.application.services.ConsultantService;
import com.esgi.architrademe.domain.*;

import java.util.UUID;

public class ConsultantController {
    private final ConsultantService consultantService;

    public ConsultantController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }

    public ConsultantId createConsultant(String firstname, String lastname, Skills skills, ADR adr, RIB rib, Availability availabilities){
        return this.consultantService.createConsultant(firstname, lastname, skills, adr, rib, availabilities);
    }

    public void addConsultant(Consultant consultant){
        this.consultantService.addConsultant(consultant);
    }

    public void searchConsultant(String criteriaField, String criteriaValue){

    }
}
