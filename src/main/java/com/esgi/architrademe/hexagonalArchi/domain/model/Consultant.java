package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.DaysEnum;
import com.esgi.architrademe.hexagonalArchi.domain.ModalityEnum;

import java.util.ArrayList;
import java.util.Objects;

public final class Consultant {
    private final ConsultantId id;
    private final String name ;
    private final Credentials credentials ;
    private final String description ;
    private final ArrayList<ConsultantSkillEnum> skills ;
    private final int experienceInYears;
    private final int pricePerDay ;
    private final int pricePerExtraDay ;
    private final DaysEnum[] availibility ; //ArrayList less efficient than array
    private final ModalityEnum modality ;
    private final String rib ;
    private final Mission[] missions ;

    public Consultant(ConsultantId id, String name, Credentials credentials, String description, ArrayList<ConsultantSkillEnum> skills, int experienceInYears, int pricePerDay, int pricePerExtraDay, DaysEnum[] availibility, ModalityEnum modality, String rib, Mission[] missions) {
        this.id = id;
        this.name = name;
        this.credentials = credentials;
        this.description = description;
        this.skills = skills;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.availibility = availibility;
        this.modality = modality;
        this.rib = rib;
        this.missions = missions;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consultant that = (Consultant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + id +
                '}';
    }
}
