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
    RIB rib;
    //String modality; //TODO to review


    public Consultant(ConsultantId consultantId, Skills skills, ADR adr, RIB rib, String firstname, String lastname, String[] availabilities) {
        this.consultantId = consultantId;
        this.skills = skills;
        this.adr = adr;
        this.rib = rib;
        this.firstname = firstname;
        this.lastname = lastname;
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

    public RIB rib(){ return rib;}

    public static Consultant generateConsultant(){
        Skills skills = Skills.create();
        ADR adr = ADR.of(300., "EUR", 7.);
        String[] days = new String[]{Days.thrusday.label};
        RIB rib = RIB.of("1234567898765432");
        return new Consultant(
                ConsultantId.of(UUID.randomUUID()),
                skills,
                adr,
                rib,
                "OMAR",
                "JAMIL",
                days
        );
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "consultantId=" + consultantId + '\n' +
                ", firstname='" + firstname + '\'' + '\n' +
                ", lastname='" + lastname + '\'' + '\n' +
                ", skills=" + skills + '\n' +
                ", adr=" + adr + '\n' +
                ", availabilities=" + Arrays.toString(availabilities) + '\n' +
                ", rib=" + rib +
                '}';
    }
}
