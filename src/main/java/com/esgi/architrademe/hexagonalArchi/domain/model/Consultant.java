package com.esgi.architrademe.hexagonalArchi.domain.model;

import com.esgi.architrademe.hexagonalArchi.domain.enums.ConsultantSkillEnum;
import com.esgi.architrademe.hexagonalArchi.domain.Credentials;
import com.esgi.architrademe.hexagonalArchi.domain.enums.DaysEnum;
import com.esgi.architrademe.hexagonalArchi.domain.enums.ModalityEnum;
import com.esgi.architrademe.hexagonalArchi.domain.model.other.Mission;

import java.util.List;
import java.util.Objects;

public final class Consultant {
    private final ConsultantId id;
    private final String name ;
    private final Credentials credentials ;
    private final String description ;
    private final List<ConsultantSkillEnum> skills ;
    private final int experienceInYears;
    private final int pricePerDay ;
    private final int pricePerExtraDay ;
    private final List<DaysEnum> availibilitys ; //ArrayList less efficient than array
    private final ModalityEnum modality ;
    private final String rib ;
    private final List<Mission> listeConsultantMissions ;

    public Consultant(ConsultantId id, String name, Credentials credentials, String description, List<ConsultantSkillEnum> skills, int experienceInYears, int pricePerDay, int pricePerExtraDay, List<DaysEnum> availibilitys, ModalityEnum modality, String rib, List<Mission> listeConsultantMissions) {
        this.id = id;
        this.name = name;
        this.credentials = credentials;
        this.description = description;
        this.skills = skills;
        this.experienceInYears = experienceInYears;
        this.pricePerDay = pricePerDay;
        this.pricePerExtraDay = pricePerExtraDay;
        this.availibilitys = availibilitys;
        this.modality = modality;
        this.rib = rib;
        this.listeConsultantMissions = listeConsultantMissions;
    }


    public ConsultantId id() {
        return id;
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
