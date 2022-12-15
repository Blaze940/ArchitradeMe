package com.esgi.architrademe;

import com.esgi.architrademe.adapter.in.ConsultantController;
import com.esgi.architrademe.adapter.out.InMemoryConsultantRepository;
import com.esgi.architrademe.application.services.ConsultantService;
import com.esgi.architrademe.domain.*;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        InMemoryConsultantRepository inMemoryConsultantRepository = new InMemoryConsultantRepository();
        ConsultantService consultantService = new ConsultantService(inMemoryConsultantRepository);
        ConsultantController consultantController = new ConsultantController(consultantService);

        // Test addConsultant controller
        Consultant consultant = Consultant.generateConsultant();
        consultantController.addConsultant(consultant);
        //System.out.println(inMemoryConsultantRepository.findById(consultant.id()));

        // Test createConsultant controller
        Skills skills = Skills.create();
        ADR adr = ADR.generateADR();
        Availability availability = Availability.generateAvaibility();
        RIB rib = RIB.generateRIB();
        ConsultantId consultant2Id = consultantController.createConsultant(
                "JUL",
                "CAP",
                skills,
                adr,
                rib,
                availability);
        System.out.println(inMemoryConsultantRepository.findById(consultant2Id));

    }

}
