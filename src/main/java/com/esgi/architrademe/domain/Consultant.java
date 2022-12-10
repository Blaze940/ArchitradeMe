package com.esgi.architrademe.domain;

import java.util.Arrays;
import java.util.UUID;

public class Consultant {
    ConsultantId consultantId;
    String firstname;
    String lastname;
    Skills skills;
    ADR adr;
    String[] availabilities;
    //String modality; //TODO to review

    public Consultant(ConsultantId consultantId, Skills skills, ADR adr, String firstname, String lastname, String[] availabilities) {
        this.consultantId = consultantId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.skills = skills;
        this.adr = adr;
        this.availabilities = availabilities;
    }

    public ConsultantId id(){
        return consultantId;
    }

    public ADR adr(){
        return adr;
    }

    public Skills skills(){
        return skills;
    }

    public static Consultant generateConsultant(){
        Skills skills = Skills.create();
        ADR adr = ADR.of(300., "EUR", 7.);
        String[] days = new String[]{Days.thrusday.label};
        return new Consultant(
                ConsultantId.of(UUID.randomUUID()),
                skills,
                adr,
                "OMAR",
                "JAMIL",
                days
        );
    }

    @Override
    public String toString() {
        return "Consultant{" + '\n' +
                "consultantId=" + consultantId +
                ", firstname='" + firstname + '\'' + '\n' +
                ", lastname='" + lastname + '\'' + '\n' +
                ", skills=" + skills.skillsMap + '\n' +
                ", adr=" + adr + '\n' +
                ", availabilities=" + Arrays.toString(availabilities) + '\n' +
                '}';
    }
}
